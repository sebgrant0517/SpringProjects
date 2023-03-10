package com.genspark.Presidents.Service;

import com.genspark.Presidents.Entity.President;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PresidentServiceImplemented implements PresidentService{
    List<President> list;
    public PresidentServiceImplemented(){
        list = new ArrayList<>();
        list.add(new President(1, "Abe Lincoln", "Emancipation Proclamation"));
        list.add(new President(2, "Teddy Roosevelt", "Trust Busting"));
        list.add(new President(3, "JFK", "Civil Rights Advocate"));
        list.add(new President(4, "George Washington", "The Original President"));
        list.add(new President(5, "Ulysses S. Grant", "General of Generals"));
    }
    @Override
    public List<President> getPresidents() {
        return list;
    }

    @Override
    public President getPresident(int c_id) {
        President pres = null;
        for(President p : list){
            if(p.getC_id() == c_id){
                pres = p;
            }
        }
        return pres;
    }

    @Override
    public President addPresident(President pres) {
        if(pres.getC_id() > 0 && pres.getC_id() <= list.size()){
            list.add(pres.getC_id() - 1, pres);
            for(int x = pres.getC_id(); x < list.size(); x++){
                list.get(x).setC_id(list.get(x).getC_id()+1);
            }
        } else{
            pres.setC_id(list.size()+1);
            list.add(pres);
        }
        return pres;
    }

    @Override
    public President updatePresident(President pres) {
        President president = null;
        for(President p : list){
            if(p.getC_id() == pres.getC_id()){
                president = p;
                president.setC_name(pres.getC_name());
                president.setC_reason(pres.getC_reason());
            }
        }
        return president;
    }

    @Override
    public String deletePresident(int c_id) {
        for(President p : list){
            if(p.getC_id() == c_id){
                for(int x = c_id; x < list.size(); x++){
                    list.get(x).setC_id(list.get(x).getC_id()-1);
                }
                list.remove(p);
            }
        }
        return "President Removed From Favorites";
    }
}
