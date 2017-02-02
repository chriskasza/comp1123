//********************************************************************
//  Palindrome.java       Author: Chris Kasza, 100133723
//  
//  Assignment 8 Q1 - COMP 1123 A2
//  
//  Palindrome class that will read text file and check if the 
//  alpha characters equate to a palindrome.  The class is case 
//  insensitive and ignores non-alpha characters.
//
//  ==============================================================
//  Dr. Trudel said it was OK if I completed this task with a GUI.
//  ==============================================================
//********************************************************************

import java.io.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public final class Palindrome extends Application
{   
   public static void main(String[] args)
   {
      Application.launch(args);
   }

   // draw UI
   @Override
   public void start(final Stage stage) {
      stage.setTitle("Palindrome Checker");
      
      final FileChooser fileChooser = new FileChooser();
      
      FileChooser.ExtensionFilter extFilter1 = 
         new FileChooser.ExtensionFilter("Text files (*.txt)", "*.txt");
      FileChooser.ExtensionFilter extFilter2 = 
         new FileChooser.ExtensionFilter("All files (*.*)", "*.*");
      fileChooser.getExtensionFilters().add(extFilter1);
      fileChooser.getExtensionFilters().add(extFilter2);
      File d = new File(System.getProperty("user.dir"));
      fileChooser.setInitialDirectory(d);
      
      final Button openButton = new Button("Open and Check...");
      
      openButton.setOnAction(
      new EventHandler<ActionEvent>() {
         @Override
         public void handle(final ActionEvent e) {
            File file = fileChooser.showOpenDialog(stage);
            try {
               if (file == null) {
                  // file not selected; do nothing
               } else if (file.length() <= 0) {
                  // pop up warning dialog saying the file is empty
                  Alert alert = new Alert(AlertType.WARNING);
                  alert.setTitle("Warning");
                  alert.setHeaderText(null);
                  alert.setContentText("Question: \"If a String object is " +
                                       "declared in the woods and nobody is " +
                                       "around to initialize it, is it " +
                                       "really a string?\"\n\nEmpty files " +
                                       "aren't palindromes, silly.  Try " +
                                       "opening a text file.");
                  alert.showAndWait();
               } else if (isBinaryFile(file)) {
                  // pop up warning saying the file is not text
                  Alert alert = new Alert(AlertType.WARNING);
                  alert.setTitle("Warning");
                  alert.setHeaderText(null);
                  alert.setContentText("Your file appears to be binary; not " +
                                       "text.  Try choosing a text file " +
                                       "instead.");
                  alert.showAndWait();
               } else if (isPalindrome(file)) {
                  // pop up dialog indicating file is palindrome
                  Alert alert = new Alert(AlertType.INFORMATION);
                  alert.setTitle("Information");
                  alert.setHeaderText(null);
                  alert.setContentText("Cool beans!\nThat file IS a " +
                                       "palindrome.");
                  alert.showAndWait();
               } else {
                  // pop up dialog indicating file is not a palindrome
                  Alert alert = new Alert(AlertType.INFORMATION);
                  alert.setTitle("Information");
                  alert.setHeaderText(null);
                  alert.setContentText("Bummer.\nThat file is NOT a " +
                                       "palindrome.");
                  alert.showAndWait();
               }
            } catch (FileNotFoundException err) {
               err.printStackTrace();
            } catch (IOException err) {
               err.printStackTrace();
            }
         }
      });
      
      final GridPane inputGridPane = new GridPane();
      
      GridPane.setConstraints(openButton, 0, 0);
      inputGridPane.setHgap(6);
      inputGridPane.setVgap(6);
      inputGridPane.getChildren().addAll(openButton);
      
      final Pane rootGroup = new VBox(12);
      rootGroup.getChildren().addAll(inputGridPane);
      rootGroup.setPadding(new Insets(12, 12, 12, 12));
      
      stage.setScene(new Scene(rootGroup));
      stage.show();
   }

   // check if a file is a palindrome
   public static boolean isPalindrome( File f )
      throws FileNotFoundException, IOException {
      int left, right;
      Scanner fileScan = new Scanner(f);
      String contents = fileScan.useDelimiter( "\\Z" ).next();
      
      left = -1;
      right = contents.length();
      
      do {
         left++;
         right--;
         
         while (contents.toLowerCase().charAt(left)<97 || 
                contents.toLowerCase().charAt(left)>122) {
            /*System.out.println("Skipping character #" + left + 
             " with value \"" + 
             contents.toLowerCase().charAt( left ) +
             "\"" );*/
            left++;
         }
         
         while (contents.toLowerCase().charAt(right)<97 || 
                contents.toLowerCase().charAt(right)>122) {
            /*System.out.println("Skipping character #" + right + 
             " with value \"" + 
             contents.toLowerCase().charAt( right ) +
             "\"" );*/
            right--;
         }
         /*System.out.println("comparing left, " + 
          contents.toLowerCase().charAt(left) + 
          ", with right, " + 
          contents.toLowerCase().charAt(right) );*/
         
      } while (contents.toLowerCase().charAt(left) == 
               contents.toLowerCase().charAt(right) && left < right);
      
      if (left < right) {
         return false;
      } else {
         return true;
      }
   }
   
   // code borrowed from http://stackoverflow.com/questions/620993/
   //                           determining-binary-text-file-type-in-java
   // Guess whether given file is binary. Just checks for anything under 0x09.
   public static boolean isBinaryFile( File f ) 
      throws FileNotFoundException, IOException {
      FileInputStream in = new FileInputStream(f);
      int size = in.available();
      if(size > 1024) size = 1024;
      byte[] data = new byte[size];
      in.read(data);
      in.close();
      
      int ascii = 0;
      int other = 0;
      
      for(int i = 0; i < data.length; i++) {
         byte b = data[i];
         if( b < 0x09 ) return true;
         
         if( b == 0x09 || b == 0x0A || b == 0x0C || b == 0x0D ) ascii++;
         else if( b >= 0x20  &&  b <= 0x7E ) ascii++;
         else other++;
      }
      
      if( other == 0 ) return false;
      
      return 100 * other / (ascii + other) > 95;
   }
}