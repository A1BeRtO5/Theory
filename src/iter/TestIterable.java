package iter;

import java.util.Iterator;

public class TestIterable {
    public static void main(String[] args) {
        for (int i : Range.fromTo(0,100)) {
            System.out.println(i);
        }
    }

    private static class Range implements Iterable<Integer> {
        int start;
        int end;

        private Range(int start, int end) {
            this.start = start;
            this.end = end;
        }
        public static Range fromTo(int from, int to){
            return new Range(from, to);
        }

        @Override
        public Iterator iterator() {
            return new Iterator(start);
        }
        class Iterator implements java.util.Iterator<Integer> {
            int current;
            @Override
            public boolean hasNext() {
                return current<=end;
            }

            public Iterator(int current) {
                this.current = current;
            }

            @Override
            public Integer next() {
                return current++;
            }
        }
    }
}