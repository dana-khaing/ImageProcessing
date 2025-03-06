import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import uk.ac.rhul.cs.csle.art.term.AbstractValuePlugin;
import uk.ac.rhul.cs.csle.art.util.Util;

public class ARTValuePlugin extends AbstractValuePlugin {
  int windowX = 1200, windowY = 450;
  HBox root = new HBox();

  Image inputImage;
  WritableImage outputImage = new WritableImage(windowX / 2, windowY);

  @Override
  public String description() {
    return "Adrian's example image processing plugin";
  }

  @Override
  public Object plugin(Object... args) {
    switch ((String) args[0]) {
    case "init":
      System.out.println("Initialising window");
      Stage stage = new Stage();
      stage.setScene(new Scene(root, windowX, windowY));
      stage.setTitle("Image processing display from an ART language");
      stage.show();
      break;

    case "load":
      InputStream inputStream = null;
      try {
        inputStream = new FileInputStream((String) args[1]);
      } catch (FileNotFoundException e) {
        Util.error("Unable to open image file " + args[1]);
      }

      inputImage = new Image(inputStream, windowX / 2, windowY, true, true);
      root.getChildren().addAll(new ImageView(inputImage), new ImageView(outputImage));
      break;

    case "invert":
      PixelReader pixelReader = inputImage.getPixelReader();
      PixelWriter pixelWriter = outputImage.getPixelWriter();

      for (int readY = 0; readY < inputImage.getHeight(); readY++)
        for (int readX = 0; readX < inputImage.getWidth(); readX++) {
          double pixel = pixelReader.getColor(readX, readY).grayscale().getRed();
          double invertedPixel = 1 - pixel;
          pixelWriter.setColor(readX, readY, new Color(invertedPixel, invertedPixel, invertedPixel, 1));
        }
      break;
      
      case "brightness":
      double factor = (double) args[1]; 
      PixelReader brightnessReader = inputImage.getPixelReader();
      PixelWriter brightnessWriter = outputImage.getPixelWriter();
    
      for (int y = 0; y < inputImage.getHeight(); y++)
        for (int x = 0; x < inputImage.getWidth(); x++) {
          Color color = brightnessReader.getColor(x, y);
    
          double red = Math.min(color.getRed() * factor, 1.0);
          double green = Math.min(color.getGreen() * factor, 1.0);
          double blue = Math.min(color.getBlue() * factor, 1.0);
    
          brightnessWriter.setColor(x, y, new Color(red, green, blue, color.getOpacity()));
        }
      break;
    
      case "contrast":
      double contrast = (double) args[1];
      PixelReader contrastReader = inputImage.getPixelReader();
      PixelWriter contrastWriter = outputImage.getPixelWriter();
  
      for (int y = 0; y < inputImage.getHeight(); y++) {
          for (int x = 0; x < inputImage.getWidth(); x++) {
              Color color = contrastReader.getColor(x, y);
  
              double red = Math.max(0.0, Math.min((color.getRed() - 0.5) * contrast + 0.5, 1.0));
              double green = Math.max(0.0, Math.min((color.getGreen() - 0.5) * contrast + 0.5, 1.0));
              double blue = Math.max(0.0, Math.min((color.getBlue() - 0.5) * contrast + 0.5, 1.0));
  
              contrastWriter.setColor(x, y, new Color(red, green, blue, color.getOpacity()));
          }
      }
      break;


      case "grayscale":
      PixelReader grayscaleReader = inputImage.getPixelReader();
      PixelWriter grayscaleWriter = outputImage.getPixelWriter();

      for (int y = 0; y < inputImage.getHeight(); y++) {
          for (int x = 0; x < inputImage.getWidth(); x++) {
              Color color = grayscaleReader.getColor(x, y);
              double red = color.getRed();
              double green = color.getGreen();
              double blue = color.getBlue();
              double gray = 0.2989 * red + 0.5870 * green + 0.1140 * blue;
              grayscaleWriter.setColor(x, y, new Color(gray, gray, gray, color.getOpacity()));
          }
      }
      break;

      case "sobel":
      PixelReader sobelReader = inputImage.getPixelReader();
      PixelWriter sobelWriter = outputImage.getPixelWriter();

      double[][] sobelX = { { -1, 0, 1 }, { -2, 0, 2 }, { -1, 0, 1 } };
      double[][] sobelY = { { -1, -2, -1 }, { 0, 0, 0 }, { 1, 2, 1 } };

      for (int y = 0; y < inputImage.getHeight(); y++) {
          for (int x = 0; x < inputImage.getWidth(); x++) {
              double redX = 0.0;
              double greenX = 0.0;
              double blueX = 0.0;
              double redY = 0.0;
              double greenY = 0.0;
              double blueY = 0.0;

              for (int dy = -1; dy <= 1; dy++) {
                  for (int dx = -1; dx <= 1; dx++) {
                      int nx = x + dx;
                      int ny = y + dy;

                      if (nx >= 0 && nx < inputImage.getWidth() && ny >= 0 && ny < inputImage.getHeight()) {
                          Color color = sobelReader.getColor(nx, ny);
                          redX += color.getRed() * sobelX[dy + 1][dx + 1];
                          greenX += color.getGreen() * sobelX[dy + 1][dx + 1];
                          blueX += color.getBlue() * sobelX[dy + 1][dx + 1];
                          redY += color.getRed() * sobelY[dy + 1][dx + 1];
                          greenY += color.getGreen() * sobelY[dy + 1][dx + 1];
                          blueY += color.getBlue() * sobelY[dy + 1][dx + 1];
                      }
                  }
              }

              double red = Math.min(Math.sqrt(redX * redX + redY * redY), 1.0);
              double green = Math.min(Math.sqrt(greenX * greenX + greenY * greenY), 1.0);
              double blue = Math.min(Math.sqrt(blueX * blueX + blueY * blueY), 1.0);

              sobelWriter.setColor(x, y, new Color(red, green, blue, 1.0));
          }
      }
      break;
    default:
      Util.fatal("Unknown plugin operation: " + args[0]);
    }

    return __done;
  }

}