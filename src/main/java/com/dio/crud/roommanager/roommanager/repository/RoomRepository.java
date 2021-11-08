package com.dio.crud.roommanager.roommanager.repository;

import com.dio.crud.roommanager.roommanager.model.Room;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {


}
