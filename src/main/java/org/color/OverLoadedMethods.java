package org.color;

public class OverLoadedMethods {
    public static void main(String[] args) {
        PhotoEditor editor = new PhotoEditor();

        // Applying a single filter
        editor.applyFilter("Vintage");

        // Applying two filters
        editor.applyFilter("Black & White", "Sepia");

        // Applying a filter with custom intensity
        editor.applyFilter("Brightness", 75);
    }
}

    // Overloaded methods => methods that share the same name but have different parameters
    //ie   Imagine you have a magic marker that can write on different things: paper, glass, and wood.
    // You use the same marker, but you hold it differently or press it harder depending on what you're writing on.


    class PhotoEditor {

        // Method to apply a single filter
        void applyFilter(String filterName) {
            System.out.println("Applying the " + filterName + " filter to the photo.");
        }

        // Overloaded method to apply two filters
        void applyFilter(String filterName1, String filterName2) {
            System.out.println("Applying the " + filterName1 + " and " + filterName2 + " filters to the photo.");
        }

        // Overloaded method to apply a filter with custom intensity
        void applyFilter(String filterName, int intensity) {
            System.out.println("Applying the " + filterName + " filter with intensity " + intensity + " to the photo.");
        }
    }








