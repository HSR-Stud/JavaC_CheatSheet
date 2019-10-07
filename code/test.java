package ch.hsr.javac.ex1.task2;

public class ImageProcessing {
	//inverts the color of each pixel
	public static int[][] invert(int[][] pixels) {
		for(int row=pixels.length-1 ; row >= 0 ; --row){
			for(int col=pixels[0].length-1 ; col >= 0 ; --col){
				pixels[row][col] *= -1;
			}
		}
		return pixels;
	}
	
	public static int[][] rotate(int[][] pixels) {
		int[][] rotated = new int[pixels[0].length][pixels.length];
		for(int row = 0 ; row <= pixels.length-1 ; ++row){
			for(int col = 0 ; col <= pixels[0].length-1 ; ++col){
				rotated[col][pixels.length-1-row] = pixels[row][col];
			}
		}
		return rotated;
	}
	
	public static int[][] mirror(int[][] pixels) {
		for(int row = 0 ; row <= pixels.length - 1 ; ++row){
			for(int col = 0 ; col < pixels[0].length / 2 ; ++col){
				int temp = pixels[row][col];
				pixels[row][col] = pixels[row][pixels[0].length-1-col];
				pixels[row][pixels[0].length-1-col] = temp;
			}
		}
		return pixels;
		
	string str = "I'm a string";