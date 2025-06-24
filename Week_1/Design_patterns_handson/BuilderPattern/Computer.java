package BuilderPattern;


public class Computer {
    private String cpu;
    private String ram;
    private String storage;

    // private constructor so only Builder can create object
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
    }

    // Static nested Builder class
    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer [CPU = " + cpu + ", RAM = " + ram + ", Storage = " + storage + "]";
    }
}
