package de.jivy.sfgpetclinic.services.map;

import de.jivy.sfgpetclinic.model.BaseEntity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T object){
        if (object != null){
            if (object.getId() == null){
                object.setId(nextId());
            }
        }else{
            throw new RuntimeException("May never be NULL!!!!!!");
        }
        map.put(object.getId(), object);
        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
    }

    // Make unique ID
    private Long nextId(){
        Long id = null;
        try{
            id = (long)map.size();
        }catch(Exception e){
            id = 1L;
        }
        return id;
    }
}
