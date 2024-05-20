package ar.edu.unlp.info.oo2.ejercicio14;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseRealAccess implements DatabaseAccess {
    private Map<String, List<String>> data;
    private int currentId;

    public DatabaseRealAccess() {
        super();
        this.data = new HashMap<>();

        this.data.put("select * from comics where id=1", Arrays.asList("Spiderman", "Marvel"));

        this.data.put("select * from comics where id=2", Arrays.asList("Batman", "DC comics"));

        this.currentId = 3;
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
        return this.data.getOrDefault(queryString, Collections.emptyList());
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        this.data.put("select * from comics where id=" + this.currentId, rowData);
        this.currentId = this.currentId + 1; // currentId
        return this.currentId - 1;
    }
}