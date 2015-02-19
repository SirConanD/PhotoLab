package pixLab.classes;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /**
   * keeps only the blue values of a picture
   */
  public static void testKeepOnlyBlue()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  /**
   * keeps only the red values of a picture
   */
  public static void testKeepOnlyRed()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.keepOnlyRed();
	  beach.explore();
  }
  
  /**
   * keeps only the green values of a picture
   */
  public static void testKeepOnlyGreen()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.keepOnlyGreen();
	  beach.explore();
  }
  
  /**
   * takes out all of the red, blue, and green values of a picture
   */
  public static void testNegate()
  {
	  Picture gorge = new Picture("gorge.jpg");
	  gorge.explore();
	  gorge.negate();
	  gorge.explore();
  }
  
  /**
   * makes all of the values a shade of gray
   */
  public static void testGrayscale()
  {
	  Picture blue = new Picture("blueMotorcycle.jpg");
	  blue.explore();
	  blue.grayscale();
	  blue.explore();
  }
  
  public static void testFixUnderwater()
  {
	  Picture water = new Picture("water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testCheckerboardFilter()
  {
	  Picture caterpillar = new Picture("caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.checkerboardFilter();
	  caterpillar.explore();
  }
  
  public static void testCheckerboardFilterBig()
  {
	  Picture caterpillar = new Picture("caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.checkerboardFilter();
	  caterpillar.explore();
  }
  
  public static void testRotateColorFilter()
  {
	  Picture blue = new Picture("blueMotorcycle.jpg");
	  blue.explore();
	  blue.rotateColorFilter();
	  blue.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture right = new Picture("swan.jpg");
	  right.explore();
	  right.mirrorVerticalRightToLeft();
	  right.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture red = new Picture("redMotorcycle.jpg");
	  red.explore();
	  red.mirrorHorizontal();
	  red.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture snow = new Picture("snowman.jpg");
	  snow.explore();
	  snow.mirrorArms();
	  snow.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testCheckerboardFilter();
	//testRotateColorFilter();
	//testCheckerboardFilterBig(); 
	//testMirrorVerticalRightToLeft();
	testMirrorHorizontal();  
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}