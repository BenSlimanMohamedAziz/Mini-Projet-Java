package Dao;

import java.util.List;

public interface DaoSal <T> {
boolean delete (T o);
T findByMat(int mat);
List <T> findAll();
}
