package com.example.BackendWeb.Service;

import com.example.BackendWeb.Model.Helper;

import java.util.List;
import java.util.Optional;

public interface IHelperService {
    List<Helper> getAllHelper();

    void createHelper(Helper helper);

    void updateHelper(Helper helper, int id);

    void deleteHelper(Integer id);

    Optional<Helper> findHelperById(Integer id);
}
