package nguyentientho.design_pattern.singleton_.singer;

import java.io.*;

public class SerializedSingletonExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializedSingleton serializedSingleton1 = SerializedSingleton.getInstance();
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("SerializedSingletonTest.txt"))) {
            out.writeObject(serializedSingleton1);
            out.writeObject(enumSingleton1);
        }
        SerializedSingleton serializedSingleton2;
        EnumSingleton enumSingleton2;
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("SerializedSingletonTest.txt"))) {
            serializedSingleton2 = (SerializedSingleton) in.readObject();
            enumSingleton2 = (EnumSingleton) in.readObject();
        }
        System.out.println("serialSingletonOrigin: " + serializedSingleton1.hashCode());
        System.out.println("serialSingletonNew: " + serializedSingleton2.hashCode());
        System.out.println("enumSingletonOrigin: " + enumSingleton1.hashCode());
        System.out.println("enumSingletonNew: " + enumSingleton2.hashCode());
    }
}
