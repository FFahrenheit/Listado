package dev413.listado;

/**
 * Created by Usuario on 17/05/2018.
 */

public class FullData {
    private String name;
    private String description;
    private String image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public FullData()
    {
        image = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/Anonymous_emblem.svg/1200px-Anonymous_emblem.svg.png";
        name = "Sin Nombre";
        description = "Animado";
    }

    public FullData(String _image, String _name, String _description)
    {
        image = _image;
        name = _name;
        description = _description;
    }
}
