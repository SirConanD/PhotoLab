package pix.view;

import java.awt.LayoutManager;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;

import pix.controller.FauxToeShopController;
import pixLab.classes.ImageDisplay;
import pixLab.classes.Picture;

public class FauxToeShopPanel extends JPanel
{
	private FauxToeShopController baseController;
	
	private JComboBox<String> filterBox;
	private JComboBox<String> imageBox;
	private JScrollPane imagePane;
	private String [] imageArray;
	private SpringLayout baseLayout;
	
	private Picture basePicture;
	
	public FauxToeShopPanel(FauxToeShopController baseController)
	{
		this.baseController = baseController;
		
		
		imagePane = new JScrollPane();
		basePicture = new Picture("beach.jpg");
		baseLayout = new SpringLayout();
		
		setupPicture();
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupComboBox()
	{
		String [] filterArray = {
				"testZeroBlue",
			    "testKeepOnlyBlue",
			    "testKeepOnlyRed",
			    "testKeepOnlyGreen",
			    "testNegate",
			    "testGrayscale",
			    "testFixUnderwater",
			    "testMirrorVertical",
				"testCheckerboardFilter",
				"testRotateColorFilter",
				"testCheckerboardFilterBig", 
				"testMirrorVerticalRightToLeft",
				"testMirrorHorizontal",  
			    "testMirrorTemple",
			    "testMirrorArms",
			    "testMirrorGull",
			    "testMirrorDiagonal",
			    "testCollage",
			    "testCopy",
			    "testEdgeDetection",
			    "testEdgeDetection2",
			    "testChromakey",
			    "testEncodeAndDecode",
			    "testGetCountRedOverValue",
			    "testSetRedToHalfValueInTopHalf",
			    "testClearBlueOverValue",
			    "testGetAverageForColumn",
		};
		
		String [] imageArray = {
				"arch.jpg",
				"babaraS.jpg",
				"beach.jpg",
				"blue-mark.jpg",
				"blueMotorcycle.jpg",
				"butterfly1.jpg",
				"caterpillar.jpg",
				"CumberlandIsland.jpg",
				"femaleLionAndHall.jpg",
				"flower1.jpg",
				"flower2.jpg",
				"gorge.jpg",
				"jenny-red.jpg",
				"KatieFancy.jpg",
				"kitten2.jpg",
				"koala.jpg",
				"moon-surface.jpg",
				"msg.jpg",
				"redMotorcycle.jpg",
				"robot.jpg",
				"seagull.jpg",
				"snowman.jpg",
				"swan.jpg",
				"tempale.jpg",
				"thruDoor.jpg",
				"wall.jpg",
				"water.jpg",
				"whiteFlower.jpg",
		};
		
		filterBox = new JComboBox(filterArray);
		imageBox = new JComboBox(imageArray);				
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(filterBox);
		this.add(imagePane);
	}
	
	private void setupPicture()
	{
		BufferedImage bufferedPic = basePicture.getBufferedImage();
		ImageDisplay picDisplay = new ImageDisplay(bufferedPic);
		imagePane.setViewportView(picDisplay);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, filterBox, 25, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, filterBox, 211, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, imagePane, 70, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, imagePane, 10, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		imageBox.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent currentImageEvent)
			{
//				loadPicture();
			}
		});
		
		filterBox.addItemListener(new ItemListener()
		{
			@Override
			public void itemStateChanged(ItemEvent currentEvent)
			{
				if(filterBox.getSelectedIndex() == 0)
				{
					basePicture.zeroBlue();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 1)
				{
					basePicture.keepOnlyBlue();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 2)
				{
					basePicture.keepOnlyRed();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 3)
				{
					basePicture.keepOnlyGreen();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 4)
				{	
					basePicture.negate();
				    setupPicture();
			    }
				else if(filterBox.getSelectedIndex() == 5)
				{
					basePicture.grayscale();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 6)
				{
					basePicture.fixUnderwater();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 7)
				{
					basePicture.mirrorVertical();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 8)
				{
					basePicture.checkerboardFilter();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 9)
				{
					basePicture.rotateColorFilter();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 10)
				{
					basePicture.checkerboardFilterBig();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 11)
				{
					basePicture.mirrorVerticalRightToLeft();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 12)
				{
					basePicture.mirrorHorizantal();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 13)
				{
					basePicture.mirrorTemple();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 14)
				{
					basePicture.mirrorArms();
					setupPicture();
				}
		  } 
	  });
   }
}
  
