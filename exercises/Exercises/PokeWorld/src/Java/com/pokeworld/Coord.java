package com.pokeworld;

public class Coord {

        int x;
        int y;

        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Coord)) return false;
        Coord coord = (Coord) obj;
        return coord.x == x && coord.y == y;
    }

        @Override
        public int hashCode() {
            int result = 17;
            result = 31 * result + y;
            result = 31 * result + x;
            return result;
        }

    }

