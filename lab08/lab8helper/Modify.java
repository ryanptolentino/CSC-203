import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.*;


public class Modify
{
    private static void processFile(String fileName, List<Point> points) throws FileNotFoundException
    {
        File file = new File(fileName);
        if (!file.exists()){throw new FileNotFoundException();}
        Scanner s = new Scanner(file);
        while (s.hasNextLine())
        {
            processLine(s.nextLine(), points);
        }
    }

    private static void processLine(String line, List<Point> points)
    {
        String[] val = line.split(",");
        Point pt = new Point(Double.parseDouble(val[0]), Double.parseDouble(val[1]), Double.parseDouble(val[2]));
        points.add(pt);
    }


    public static void main(String[] args) throws IOException
    {
        String newFile = "drawMe.txt";
        List<Point> points = new LinkedList<>();
        try
        {
            processFile("positions.txt", points);
            File file = new File(newFile);
            if (!file.exists()){file.createNewFile();}
            FileWriter writer = new FileWriter(file.getAbsoluteFile());
            BufferedWriter buffered = new BufferedWriter(writer);
            List<Point> ptStream = points.stream().filter(p -> p.getZ() <= 2).map(p -> p.scale(.5)).map(p -> p.translate(-157,-37)).collect(Collectors.toList());
            for (Point pt : ptStream)
            {
                String newLine = String.format("%f, %f, %f\n",pt.getX(), pt.getY(), pt.getZ());
                buffered.write(newLine);
            }
            buffered.close();
        }
        catch(FileNotFoundException e){e.getMessage();}
        catch(IOException ioe){ioe.getMessage();}
    }
}