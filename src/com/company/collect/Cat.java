package com.company.collect;

public class Cat implements Comparable<Cat> {
    private String name;
    private Integer age;
    private double diameterOfNose;

    public Cat(String name, Integer age, double diameterOfNose) {
        this.name = name;
        this.age = age;
        this.diameterOfNose = diameterOfNose;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getDiameterOfNose() {
        return diameterOfNose;
    }

    public void setDiameterOfNose(double diameterOfNose) {
        this.diameterOfNose = diameterOfNose;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;

        Cat cat = (Cat) o;

        if (Double.compare(cat.getDiameterOfNose(), getDiameterOfNose()) != 0) return false;
        if (!getName().equals(cat.getName())) return false;
        return getAge().equals(cat.getAge());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName().hashCode();
        result = 31 * result + getAge();
        temp = Double.doubleToLongBits(getDiameterOfNose());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override // o1 = this, o2 = o
    public int compareTo(Cat o) {
        if (!this.getName().equals(o.getName())) {
            return this.getName().compareTo(o.getName());
        }
        if (!this.getAge().equals(o.getAge())) {
            return this.getAge()-o.getAge();
        }

        if (this.getDiameterOfNose() != o.getDiameterOfNose()) {
            return Double.compare(this.getDiameterOfNose(), o.getDiameterOfNose());
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", diameterOfNose=" + diameterOfNose +
                '}';
    }
}
