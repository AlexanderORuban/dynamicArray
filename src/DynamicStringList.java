public class DynamicStringList implements StringList {
    
    private String[] stringArray = new String[10];

    public String get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        
        return stringArray[index];
    }

    public void set(int index, String value) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        stringArray[index] = value;
    }
}