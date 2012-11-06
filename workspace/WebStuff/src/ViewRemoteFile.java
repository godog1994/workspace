import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;
public class ViewRemoteFile extends JApplet {
	private JButton jbtView = new JButton("View");
	private JTextField jtfURL = new JTextField(12);
	private JTextArea jtaFile = new JTextArea();
	private JLabel jlblStatus = new JLabel();
	
	public void init()
	{
		JPanel p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		p1.add(new JLabel("Filename"), BorderLayout.WEST);
		p1.add(jtfURL, BorderLayout.CENTER);
		p1.add(jbtView, BorderLayout.EAST);
		
		setLayout(new BorderLayout());
		add(new JScrollPane(jtaFile), BorderLayout.CENTER);
		add(p1, BorderLayout.NORTH);
		add(jlblStatus, BorderLayout.SOUTH);
		
		jbtView.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				showFile();
			}
		});
	}
	
	private void showFile()
	{
		BufferedReader infile = null;
		URL url = null;
		
		try
		{
			url = new URL(jtfURL.getText().trim());
			
			InputStream is = url.openStream();
			infile = new BufferedReader(new InputStreamReader(is));
			
			String inLine;
			
			while ((inLine = infile.readLine()) != null)
			{
				jtaFile.append(inLine + '\n');
			}
			jlblStatus.setText("File loaded successfully");
		}
		catch (FileNotFoundException e)
		{
			jlblStatus.setText("URL " + url + " not found.");
		}
		catch (IOException e)
		{
			jlblStatus.setText(e.getMessage());
		}
		finally 
		{
			try 
			{
				if (infile != null) infile.close();
			}
			catch (IOException ex) {
				
			}
		}
	}

	

}
