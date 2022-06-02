import java.awt.*;
import java.util.LinkedList;
import java.util.TimerTask;

class DrawTask extends TimerTask {
    public static int i;
    private LinkedList<Node> nodes;

    private Color [][] terrainGrid;
    public DrawTask(LinkedList<Node> nodes, Color[][] terrainGrid ) {
        this.nodes = nodes;
        this.terrainGrid = terrainGrid;
    }

    public void run() {
        if (i >= nodes.size()) {
            this.cancel();
            return;
        }
        Node n = nodes.get(i);
        int x = (int) n.getX();
        int y = (int) n.getY();
        if (i == 0 || i == nodes.size() - 1) {
            terrainGrid[x][y] = Color.RED;
        } else {
            terrainGrid[x][y] = Color.YELLOW;
        }
        System.out.println(String.format("%d %d", x, y));
        i++;
    }
}
