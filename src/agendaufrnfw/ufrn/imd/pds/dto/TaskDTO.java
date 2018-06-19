package agendaufrnfw.ufrn.imd.pds.dto;

import com.google.gson.Gson;

import agendaufrnfw.ufrn.imd.pds.model.calendar.Task;

public class TaskDTO extends DTO { 

    @Override
    public Task toObject(String json) {
        Gson gson = new Gson();

        return gson.fromJson(trataJson(json), Task.class);
    }

    @Override
    public Task[] toArrayObject(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Task[].class);
    }
}