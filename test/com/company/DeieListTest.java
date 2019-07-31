package com.company;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;


public class DeieListTest {

    public static class LinkedList {
        Maillon firstMaillon;


        public void add(Object o) {

            final Maillon maillon = new Maillon();
            maillon.data = o;
            if(firstMaillon == null){
                firstMaillon =  maillon;
            }
            firstMaillon.nextMaillon = maillon;

            Maillon last;
            Maillon currentMaillon = firstMaillon;

            if(currentMaillon.nextMaillon == null){
                last = currentMaillon;
            }
            while (currentMaillon.nextMaillon != null){

                   currentMaillon = currentMaillon.nextMaillon;

           }

        }


        public void print(){
            Maillon current = firstMaillon;
            do {

                System.out.println("data " + current.data);
                current = current.nextMaillon;
            } while (current != null);

        }

        public Object get(int index) {
            Maillon resultMaillon = firstMaillon;

            for (int i = 0; i < index ; i++) {
                resultMaillon = resultMaillon.nextMaillon;
            }
            return resultMaillon.data;
        }

    }

    public static class Maillon {
        Object data;
        Maillon nextMaillon;
    }

    @Test
    public void should_add_one_item_in_the_list() {
        // given
        String data = "blibliblo";
        final LinkedList list = new LinkedList();
        // when
        list.add(data);
        // then
        assertEquals(data, list.get(0));
    }

        @Test
        public void should_print_the_list() {
            // given
            String data = "blibliblo";
            final LinkedList list = new LinkedList();
            // when
            list.add(data);
            list.add("nononno");
            list.print();
            // then

        }

    @Test
    public void should_add_two_items_in_the_list() {
        // given
        String data = "blibliblo";
        String data2 = "blibliblo22";
        final LinkedList list = new LinkedList();
        // when
        list.add(data);
        list.add(data2);
        // then
        assertEquals(data, list.get(0));
        assertEquals(data2, list.get(1));
    }

    @Test @Ignore
    public void should_add_lots_of_items_in_the_list() {
        // given
        int size = 1000;
        final LinkedList list = new LinkedList();
        for (int i = 0; i < size; i++) {
            String data = "blibliblo " + i;
            list.add(data);

        }
        // when
        Object data = list.get(500);
        // then
        assertEquals("blibliblo 500",data);
    }

}
