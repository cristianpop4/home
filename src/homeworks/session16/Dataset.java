package homeworks.session16;

import java.util.List;

public class Dataset {
    private String name;
    private List<Integer> values;

    public Dataset(String name, List<Integer> values) {
        this.name = name;
        this.values = values;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getValues() {
        return values;
    }

    @Override
    public String toString() {
        int previewSize = 5;
        List<Integer> previewList = values.size() > previewSize? values.subList(0 , previewSize) : values;

        return "Dataset{" +
                "name='" + name + '\'' +
                ", preview=" + previewList + (values.size() > previewSize ? ", ..." : "") +
                '}';
    }
}

class DatasetDemo{
    static void main(String[] args) {
        Dataset data = new Dataset("Data", List.of(1,2,3,4,5,6,7,8,9,10));
        System.out.println(data);
    }
}