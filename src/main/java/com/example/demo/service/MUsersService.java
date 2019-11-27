package com.example.demo.service;

import com.example.demo.Repository.MUsersRepository;
import com.example.demo.model.MUsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MUsersService {

    @Autowired
    private MUsersRepository mUsersRepository;

    //DBの行を全て取得
    public List<MUsersEntity> findAll(){
        return mUsersRepository.findAll();
    }

    //引数の値とDBのidが一致した行を取得
    public Optional<MUsersEntity> findBy(Integer id){
        return mUsersRepository.findById(id);
    }

    //引数の値をDBの行に追加する
    public MUsersEntity save(MUsersEntity mUsers) {
        return mUsersRepository.save(mUsers);
    }

    //引数の値と同じidを持つ行をDBから削除する
    public void delete(Integer id){
        mUsersRepository.deleteById(id);
    }
}
