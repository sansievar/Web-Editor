package SantiagoSierraLab3;

/**
 * @author sansi
 * 
 */
import javax.swing.*;

/*
 * The purpose of this file is to test all four of the components
 */

public class WebEditorTest {
    
    public static void main(String[] args) {

        //Create a control panel
        JFrame controlPanel = new JFrame("Web Editor Test");

        //Create buttons each component
        JButton testImageButton = new JButton("Test Image Component");
        JButton testLinkButton = new JButton("Test Link Component");
        JButton testOrderedListButton = new JButton("Test Ordered List Component");
        JButton testUnorderedListButton = new JButton("Test Unordered List Component");

        //Action listeners for the buttons
        testImageButton.addActionListener(e -> testImageComponent(new imageInputDialog()));
        testLinkButton.addActionListener(e -> testLinkComponent(new linkInputDialog()));
        testOrderedListButton.addActionListener(e -> testOrderedListComponent(new orderedListInputDialog()));
        testUnorderedListButton.addActionListener(e -> testUnorderedListComponent(new unOrderedListInputDialog()));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(testImageButton);
        buttonPanel.add(testLinkButton);
        buttonPanel.add(testOrderedListButton);
        buttonPanel.add(testUnorderedListButton);
        controlPanel.add(buttonPanel);
        controlPanel.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        controlPanel.pack();
        controlPanel.setLocationRelativeTo(null);
        controlPanel.setVisible(true); 
    }

    // Test components
    private static void testImageComponent(imageInputDialog component) {
        SwingUtilities.invokeLater(() -> {
            component.startOver();
            component.setVisible(true);
        });
    }

    private static void testLinkComponent(linkInputDialog component) {
        SwingUtilities.invokeLater(() -> {
            component.startOver();
            component.setVisible(true);
        });
    }

    private static void testOrderedListComponent(orderedListInputDialog component) {
        SwingUtilities.invokeLater(() -> {
            component.startOver();
            component.setVisible(true);
        });
    }

    private static void testUnorderedListComponent(unOrderedListInputDialog component) {
        SwingUtilities.invokeLater(() -> {
            component.startOver();
            component.setVisible(true);
        });
    }
}
