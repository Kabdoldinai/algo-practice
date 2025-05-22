package org.example.two_pointers;

public class FlippingImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int left = 0, right = image[i].length - 1;

            while (left <= right) {
                swap(image[i], left, right);
                flip(image[i], left);
                left++;
                right--;
            }
        }

        return image;
    }

    private void swap(int[] img, int left, int right) {
        // while swapping need to flip
        int temp = img[left];
        img[left] = img[right];
        img[right] = temp;
    }

    private void flip(int[] img, int left) {
        img[left] = img[left] == 0 ? 1 : 0;
        if (left != img.length - left - 1) {
            img[img.length - left - 1] = img[img.length - left - 1] == 0 ? 1 : 0;
        }
    }
}
