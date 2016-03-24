package recursion.view;
import javax.swing.JFrame;
import recursion.controller.Controller;
import recursion.view.RecursionPanel;


public class RecursionFrame	extends JFrame
{
	private Controller baseController;
	private RecursionPanel basePanel;
	
	public RecursionFrame(Controller baseController)
	{
		this.baseController = baseController;
		basePanel = new RecursionPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setTitle("Recursions!");
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setSize(500,500);
		this.setVisible(true);
	}
}