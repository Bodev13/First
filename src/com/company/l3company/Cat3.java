package com.company.l3company;

    public class Cat3 {
        private  int size;
        private String name;
        private String colour;

        public Cat3(int size, String name, String colour) {
            this.size = size;
            this.name = name;
            this.colour = colour;
        }

        private int getSize() {
            return size;
        }

        private void setSize(int size) {
            this.size = size;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColour() {
            return colour;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }
    }

