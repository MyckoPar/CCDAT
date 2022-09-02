import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        // 1. Create your own music playlist by creating a LinkedList object
        LinkedList<String> playList = new LinkedList<>();

        // 2. Add 5 new songs to your Playlist using the add() method
        playList.add("B.O.Y.M");
        playList.add("772 LOVE");
        playList.add("MUNTING PARAISO");
        playList.add("NICE AND SLOW");
        playList.add("SOLO MISSION");

        // 3. Add a new song at the front of the Playlist using the addFirst() method
        playList.addFirst("MONEY TREES");

        // 4. Add a new song at the end of the Playlist using the addLast() method
        playList.addLast("CO-PILOT");

        // 5. Display the song at the front of the Playlist using the combination of
        // get() method and the println() method
        String wan = playList.get(0);
        System.out.println("FRONT SONG " + wan);

        // 6. Replace the last song using the set() method
        playList.set(6, "LOVE MELODY");

        // 7. Remove the first song using the remove() method
        String dos = playList.remove(0);
        System.out.println("REMOVE " + dos);

        // 8. Display all songs in your Playlist using the println method
        System.out.println("ALL SONGS IN THE PLAYLIST " + playList);
    }
}
