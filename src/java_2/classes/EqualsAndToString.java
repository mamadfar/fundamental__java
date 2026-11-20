package java_2.classes;

import java.util.Objects;

class Laptop2 {

    String model;
    int price;

    @Override
    public int hashCode() { //? hashoCode will generate a hash version of the data in string
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.model);
        hash = 17 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Laptop2 other = (Laptop2) obj;
        if (this.price != other.price) {
            return false;
        }
        return Objects.equals(this.model, other.model);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Laptop2{");
        sb.append("model=").append(model);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    
}

public class EqualsAndToString {
    public static void main(String[] args) {
        Laptop2 obj1 = new Laptop2();
        obj1.model = "ROG 2025";
        obj1.price = 1000;

        Laptop2 obj2 = new Laptop2();
        obj2.model = "ROG 2025";
        obj2.price = 1000;

        boolean result = obj1.equals(obj2);
        IO.println(result);
    }
}
