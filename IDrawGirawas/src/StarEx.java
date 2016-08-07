import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Surface extends JPanel {
      
    private void doDrawing(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g.create();

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                             RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                             RenderingHints.VALUE_RENDER_QUALITY);

        g2d.translate(50, 50);

        double points[][];
        
        //START DRAWING PARROT
        
        //Body
        points = new double[][]{
            { 238, 197 },
            { 253, 198 },
            { 263, 204 },
            { 275, 214 },
            { 280, 234 },
            { 282, 250 },
            { 281, 266 },
            { 281, 278 },
            { 281, 285 },
            { 285, 332 },
            { 280, 350 },
            { 278, 356 },
            { 234, 357 },
            { 237, 346 },
            { 234, 340 },
            { 226, 328 },
            { 220, 308 },
            { 219, 286 },
            { 223, 272 },
            { 230, 255 },
            { 237, 245 },
            { 238, 239 },
            { 236, 232 },
            { 235, 219 },
            { 237, 207 },
            { 238, 199 }
        };
        drawAndColourThisArea(points, g2d, Color.green);

        //Wing
        points = new double[][]{ 
            { 266, 281 },
            { 269, 282 },
            { 275, 281 },
            { 279, 284 },
            { 284, 290 },
            { 289, 303 },
            { 292, 314 },
            { 292, 328 },
            { 292, 340 },
            { 290, 346 },
            { 289, 354 },
            { 263, 354 },
            { 259, 350 },
            { 258, 345 },
            { 254, 337 },
            { 250, 329 },
            { 248, 310 },
            { 249, 299 },
            { 254, 297 },
            { 258, 293 },
            { 260, 286 },
            { 264, 282 }
        };
        drawAndColourThisArea(points, g2d, new Color(40, 200, 80));
        
        //Beak
        points = new double[][]{
            { 220, 228 },
            { 219, 223 },
            { 219, 217 },
            { 220, 213 },
            { 222, 208 },
            { 225, 205 },
            { 229, 202 },
            { 234, 199 },
            { 238, 198 },
            { 237, 202 },
            { 239, 205 },
            { 237, 209 },
            { 236, 213 },
            { 236, 215 },
            { 236, 217 },
            { 233, 217 },
            { 229, 219 },
            { 227, 219 },
            { 225, 219 },
            { 222, 220 },
            { 221, 223 },
            { 221, 226 },
            { 221, 229 }
        };
        drawAndColourThisArea(points, g2d, new Color(200, 80, 40));
        
        //Lower beak
        points = new double[][]{
            { 224, 220 },
            { 226, 221 },
            { 228, 222 },
            { 230, 223 },
            { 234, 222 },
            { 236, 221 },
            { 233, 225 },
            { 233, 229 },
            { 234, 234 },
            { 230, 231 },
            { 227, 228 },
            { 225, 222 }
        };
        drawAndColourThisArea(points, g2d, new Color(200, 80, 40));
        
        //Red patch
        points = new double[][]{
            { 270, 282 },
            { 275, 282 },
            { 281, 285 },
            { 282, 291 },
            { 284, 293 },
            { 284, 301 },
            { 284, 309 },
            { 284, 313 },
            { 288, 312 },
            { 290, 306 },
            { 287, 316 },
            { 286, 320 },
            { 288, 323 },
            { 288, 326 },
            { 284, 333 },
            { 281, 324 },
            { 277, 322 },
            { 274, 318 },
            { 272, 308 },
            { 271, 299 },
            { 270, 288 }
        };
        drawAndColourThisArea(points, g2d, new Color(200, 80, 160));
        
        //Eye
        points = new double[][]{
            { 248, 211 },
            { 250, 212 },
            { 252, 213 },
            { 252, 216 },
            { 250, 217 },
            { 247, 217 },
            { 246, 216 },
            { 246, 212 }
        };
        drawAndColourThisArea(points, g2d, new Color(20, 20, 20));
        
        
        //DRAW MUSTAFA
        points = new double[][]{
            { 230, 357 },
            { 199, 320 },
            { 164, 283 },
            { 158, 262 },
            { 34, 207 },
            { 9, 213 },
            { 28, 325 }
        };
        drawAndColourThisArea(points, g2d, new Color(160, 140, 120));
        
        //DRAW MUSTAFA BEARD
        points = new double[][]{
            { 53, 224 },
            { 47, 210 },
            { 56, 187 },
            { 63, 172 },
            { 67, 152 },
            { 72, 134 },
            { 77, 115 },
            { 73, 106 },
            { 62, 99 },
            { 53, 91 },
            { 42, 101 },
            { 40, 119 },
            { 45, 145 },
            { 49, 154 },
            { 42, 178 },
            { 35, 164 },
            { 33, 146 },
            { 34, 128 },
            { 36, 110 },
            { 45, 78 },
            { 55, 42 },
            { 75, 23 },
            { 106, 11 },
            { 140, 8 },
            { 168, 13 },
            { 184, 20 },
            { 206, 31 },
            { 225, 46 },
            { 238, 64 },
            { 244, 100 },
            { 242, 107 },
            { 228, 109 },
            { 222, 113 },
            { 218, 94 },
            { 206, 89 },
            { 179, 82 },
            { 158, 76 },
            { 134, 72 },
            { 118, 75 },
            { 93, 90 },
            { 88, 106 },
            { 83, 116 },
            { 82, 132 },
            { 119, 207 },
            { 132, 216 },
            { 146, 223 },
            { 169, 228 },
            { 174, 254 },
            { 166, 265 },
            { 150, 275 },
            { 140, 282 },
            { 123, 280 },
            { 97, 259 }
        };
        drawAndColourThisArea(points, g2d, new Color(40, 40, 40));
        
        //DRAW MUSTAFA MUSTACHE
        points = new double[][]{
            { 117, 227 },
            { 129, 186 },
            { 139, 185 },
            { 150, 184 },
            { 160, 185 },
            { 171, 188 },
            { 179, 193 },
            { 185, 197 },
            { 187, 204 },
            { 190, 207 },
            { 188, 215 },
            { 184, 219 },
            { 183, 211 },
            { 181, 207 },
            { 177, 204 },
            { 168, 199 },
            { 160, 197 },
            { 152, 194 },
            { 144, 193 },
            { 141, 195 },
            { 137, 204 },
            { 133, 211 },
            { 130, 221 }
        };
        drawAndColourThisArea(points, g2d, new Color(40, 40, 40));
        
        g2d.dispose();
    }

    void drawAndColourThisArea(double points[][], Graphics2D g2d, Color color)
    {
        g2d.setPaint(color);
        GeneralPath path = new GeneralPath();
        path.moveTo(points[0][0], points[0][1]);

        for (int k = 1; k < points.length; k++)
            path.lineTo(points[k][0], points[k][1]);

        path.closePath();
        g2d.fill(path);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        doDrawing(g);
    }
}

public class StarEx extends JFrame {
    
    public StarEx() {

        initUI();
    }    
    
    private void initUI() {
        
        add(new Surface());
        
        setTitle("Parrot");
        setSize(450, 450);
        setLocationRelativeTo(null);           
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                StarEx ex = new StarEx();
                ex.setVisible(true);
            }
        });
    }    
}