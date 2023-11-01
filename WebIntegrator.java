package SantiagoSierraLab3;

/**
 * @author sansi
 * To be able to incorporate the components into a larger application I decided to create an interface
 */
public interface webIntegrator {
    void startOver();
    void save();
    void addContent(String... content);
}
