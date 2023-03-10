package com.genspark.Presidents.Service;

import com.genspark.Presidents.Entity.President;

import java.util.List;

public interface PresidentService {
    List<President> getPresidents();
    President getPresident(int c_id);
    President addPresident(President pres);
    President updatePresident(President pres);
    String deletePresident(int c_id);
}
