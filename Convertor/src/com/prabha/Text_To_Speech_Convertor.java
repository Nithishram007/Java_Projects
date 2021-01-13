package com.prabha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Text_To_Speech_Convertor {

	private JFrame frmTextToSpeech;
	private static final String VOICENAME="kevin16";
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Text_To_Speech_Convertor window = new Text_To_Speech_Convertor();
					window.frmTextToSpeech.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Text_To_Speech_Convertor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTextToSpeech = new JFrame();
		frmTextToSpeech.setTitle("Text To Speech");
		frmTextToSpeech.setBounds(0, 0, 500, 500);
		frmTextToSpeech.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTextToSpeech.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 0, 484, 461);
		frmTextToSpeech.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(28, 89, 428, 276);
		panel.add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("Text To Speech Convertor");
		lblNewLabel_1.setBounds(67, 23, 389, 37);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel_1.setForeground(new Color(255, 127, 80));
		panel.add(lblNewLabel_1);
		
	
		JButton btnNewButton = new JButton("Speak");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				Voice voice;
				VoiceManager vm = VoiceManager.getInstance();
				voice = vm.getVoice(VOICENAME);
				voice.allocate();
				
				try
				{
					voice.speak(textArea.getText());
				}catch(Exception exception)
				{
					JOptionPane.showConfirmDialog(null,"Cant talk me ,error");
				}
				
				
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(new Color(255, 127, 80));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(189, 396, 109, 37);
		panel.add(btnNewButton);
	}
}
