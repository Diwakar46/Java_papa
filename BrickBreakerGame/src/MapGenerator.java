import java.awt.*;
public class MapGenerator {
    int map[][];
    int brickHeight;
    int brickWidth;
    public MapGenerator(int row ,int col){
        map = new int[row][col];

       for(int i = 0 ; i< map.length;i++){
           //map.length gives value of row and ,map[0].length gives value of row
           for(int j = 0 ; i<map[0].length;i ++){
           map[i][j] = 1;

           }

       }
       brickHeight = 540/col;
       brickWidth = 150/row;

    }
    public void draw(Graphics2D graphics2D){
        for(int i = 0;i < map.length; i++ ){
            for(int j = 0;i< map[0].length;i++){
                if(map[i][j] > 0){

                    graphics2D.setColor(Color.white);
                    graphics2D.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);

                    // this is just to show separate brick, game can still run without it
                    graphics2D.setStroke(new BasicStroke(3));
                    graphics2D.setColor(Color.darkGray);
                    graphics2D.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                }
            }
        }
    }
    public void setBrickValue(int value,int row, int col){
        map[row][col] = value;

    }
}
