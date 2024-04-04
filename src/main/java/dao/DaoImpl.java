package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//version base de données
@Repository("dao") //à la place dutiliser les spring et l autre methode d injection de dependances on utilise les annotations à la place de config.xml
//spring diferrencie entre les annotations de chaque couche à la place de faire component dans dao on fait repository utiliser uniquement pour dao
//les annotations nous dit à spring creer moi un objet de cette classe ca remplace <bean.... dans xml
public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("version base de données");
        double data=34;
        return data;

    }
}
