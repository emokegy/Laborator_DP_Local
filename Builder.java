import java.util.HashMap;

public interface Builder {

    Element GetResult();
    void Build();

    Element BuildSection(HashMap<String, Object> map);
    Element BuildParagraph(HashMap<String, Object> map);
    Element BuildImage(HashMap<String, Object> map);
    Element BuildImageProxy(HashMap<String, Object> map);
    Element BuildTable(HashMap<String, Object> map);

}
