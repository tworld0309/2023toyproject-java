package com.hotel.serverapi.data.repository;

import com.hotel.serverapi.data.entity.TbUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<TbUserEntity, String>, UserRepositoryCustom {


}