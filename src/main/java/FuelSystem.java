import javax.imageio.ImageIO;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FuelSystem extends Applet implements MouseListener {

    int x, y;
    private static final long serialVersionUID = 1L;
    private BufferedImage bufImg;

    //Creating mouseListener
    public void init() {
        addMouseListener(this);
    }

    //When button click -> calculating cursor coordinates
    @Override
    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
        System.out.println(this.x + " " + this.y);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


    //Image input realization
    MediaTracker tr;

    boolean CheckL1 = true;
    boolean CheckL2 = false;
    boolean CheckLR1 = true;
    boolean CheckR2 = false;
    boolean CheckR3 = false;
    boolean CheckL3 = false;
    boolean CheckBut1 = false;
    boolean CheckBut2 = false;
    boolean CheckBut3 = false;
    boolean CheckBut4 = false;
    boolean CheckAll = false;

    @Override
    public void paint(Graphics g) {
        resize(1300, 720);
        tr = new MediaTracker(this);
        try {
            bufImg = ImageIO.read(new File("D:\\University\\2year\\CourseWorkImg\1.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        g.drawImage(bufImg, 335, 10, this);

        try {
            bufImg = ImageIO.read(new File("D:\\University\\2year\\CourseWorkImg\2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        g.drawImage(bufImg, 22, 47, this);

        try {
            bufImg = ImageIO.read(new File("D:\\University\\2year\\CourseWorkImg\3.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        g.drawImage(bufImg, 820, 47, this);

        //Starter Interface
        if (x > 392 && x < 444 && y > 25 && y < 146 && CheckL1) {
            try {
                // Lever1 Logic
                bufImg = ImageIO.read(new File("D:\\University\\2year\\CourseWorkImg\4.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            g.drawImage(bufImg, 335, 12, this);
            //Drawing second image
            CheckL1 = false;
            CheckL2 = true;
        } else if (x > 662 && x < 714 && y > 27 && y < 152 && CheckLR1) {
            try {
                //Lever2 logic
                bufImg = ImageIO.read(new File("D:\\University\\2year\\CourseWorkImg\5.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            g.drawImage(bufImg, 335, 12, this);
            //Printing second image
            CheckLR1 = false;
            CheckR2 = true;
        } else if (x > 662 && x < 714 && y > 27 && y < 153 && CheckR2) {
            try {
                bufImg = ImageIO.read(new File("D:\\University\\2year\\CourseWorkImg\7.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            g.drawImage(bufImg, 335, 12, this);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                bufImg = ImageIO.read(new File("D:\\University\\2year\\CourseWorkImg\7.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            g.drawImage(bufImg, 335, 12, this); // Right toggle switch

            CheckL2 = false;
            CheckR2 = false;
            CheckL2 = false;

        } else if (x > 392 && x < 444 && y > 25 && y < 146 && CheckL3) {
            try {
                //Lever1 closing
                bufImg = ImageIO.read(new File("D:\\University\\2year\\CourseWorkImg\\8.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            g.drawImage(bufImg, 335, 12, this);
            CheckR3 = true;
        } else if (x > 662 && x < 714 && y > 27 && y < 153 && CheckR3) {
            try {
                //Lever2 closing

                bufImg = ImageIO.read(new File("D:\\University\\2year\\CourseWorkImg\\9.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            CheckR3 = false;
            CheckBut1 = true;
        } else if (x > 393 && x < 438 && y > 276 && y < 327 && CheckBut1) {
            try {
                bufImg = ImageIO.read(new File("D:\\University\\2year\\CourseWorkImg\\10.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            g.drawImage(BufImg, 335, 12, this);
            CheckBut2 = true;
            CheckBut1 = true;
        } else if (x > 473 && x < 523 && y > 278 && y < 324 && CheckBut2) {
            try {
                bufImg = ImageIO.read(new File("D:\\University\\2year\\CourseWorkImg\11.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            g.drawImage(bufImg, 335, 12, this);
            CheckBut2 = false;
            CheckBut3 = true;
        } else if (x > 568 && x < 619 && y > 279 && y < 326 && CheckBut3) {
            try {
                bufImg = ImageIO.read(new File("D:\\University\\2year\\CourseWorkImg\\12.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            g.drawImage(bufImg, 335, 12, this);
            CheckBut3 = false;
            CheckBut4 = true;
        } else if (x > 643 && x < 697 && y > 278 && y < 324 && CheckBut4) {
            try {
                bufImg = ImageIO.read(new File("D:\\University\\2year\\CourseWorkImg\\13.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            g.drawImage(bufImg, 335, 12, this);
            CheckBut4 = false;
            CheckAll = true;
        }
        if (CheckAll) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                bufImg = ImageIO.read(new File("D:\\University\\2year\\CourseWorkImg\\14.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            g.drawImage(bufImg, 22, 47, this);

            try {
                bufImg = ImageIO.read(new File("D:\\University\\2year\\CourseWorkImg\\15.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            g.drawImage(bufImg, 815, 47, this);
        }
    }
}