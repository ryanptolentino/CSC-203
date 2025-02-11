import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCases
{
   private static final Song[] songs = new Song[] {
         new Song("Decemberists", "The Mariner's Revenge Song", 2005),
         new Song("Rogue Wave", "Love's Lost Guarantee", 2005),
         new Song("Avett Brothers", "Talk on Indolence", 2006),
         new Song("Gerry Rafferty", "Baker Street", 1998),
         new Song("City and Colour", "Sleeping Sickness", 2007),
         new Song("Foo Fighters", "Baker Street", 1997),
         new Song("Queen", "Bohemian Rhapsody", 1975),
         new Song("Gerry Rafferty", "Baker Street", 1978)
      };

   @Test
   public void testArtistComparator()
   {
      Comparator<Song> compArtist = new ArtComparator();
      // true,true,true
      boolean [] testCompare = { compArtist.compare(songs[0],songs[1]) < 0 , compArtist.compare(songs[5],songs[4]) > 0 , compArtist.compare(songs[3],songs[7]) == 0};

      assertEquals(true,testCompare[0]);

      assertEquals(true,testCompare[1]);

      assertEquals(true,testCompare[2]);
   }

   @Test
   public void testLambdaTitleComparator()
   {
      Comparator<Song> lambda = (Song s1, Song s2) -> {return s1.getArtist().compareTo(s2.getArtist());} ;

      boolean [] testCompare = { lambda.compare(songs[3],songs[0]) > 0 , lambda.compare(songs[5],songs[6]) <  0  , lambda.compare(songs[0],songs[7]) < 0};

      assertEquals(true, testCompare[0]);
      assertEquals(true, testCompare[1]);
      assertEquals(true, testCompare[2]);
   }

   @Test
   public void testYearExtractorComparator() {
      Comparator<Song> compKeyExtractor = Comparator.comparingInt(Song::getYear);   //ells compare method to sort by natural order of year

      compKeyExtractor = compKeyExtractor.reversed();

      int[] compareTest = {
              compKeyExtractor.compare(songs[2], songs[3]),
              compKeyExtractor.compare(songs[7], songs[6]),};
   }



   @Test
   public void testThenComparing()
   {
      Comparator<Song> compKeyExtractor = (Comparator.comparing(Song::getTitle)).thenComparing(Song::getArtist);
      int [] compareTest = { 	compKeyExtractor.compare(songs[7],songs[6]), compKeyExtractor.compare(songs[5],songs[7])};

      boolean [] testCompare = { compareTest[0] < 0 , compareTest[1] < 0};

      assertEquals(true, testCompare[0]);
      assertEquals(true, testCompare[1]);
   }

   @Test
   public void runSort()
   {
      Comparator <Song> compSort = ((Comparator.comparing(Song::getArtist)).
              thenComparing(Song::getTitle)).
              thenComparing(Song::getYear);

      List<Song> songList = new ArrayList<>(Arrays.asList(songs));
      List<Song> expectedList = Arrays.asList(
         new Song("Avett Brothers", "Talk on Indolence", 2006),
         new Song("City and Colour", "Sleeping Sickness", 2007),
         new Song("Decemberists", "The Mariner's Revenge Song", 2005),
         new Song("Foo Fighters", "Baker Street", 1997),
         new Song("Gerry Rafferty", "Baker Street", 1978),
         new Song("Gerry Rafferty", "Baker Street", 1998),
         new Song("Queen", "Bohemian Rhapsody", 1975),
         new Song("Rogue Wave", "Love's Lost Guarantee", 2005)
         );

      songList.sort(compSort);
      assertEquals(songList, expectedList);
   }
}
