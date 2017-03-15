import java.io.IOException;

/* Assignment: ...
 * Author: Merrick Rumel
 * Date: 3/15/2017
 * Reference: ...
 */
public interface IMapCreator {
    void scanTerrain(String fileName, int threshold) throws IOException;
// Read from the file, set up the IArea[10][10] and set the
    //terrain for the object of TerrainScanner
    TerrainScanner getScanner();
    void setScanner(TerrainScanner scanner);
}
