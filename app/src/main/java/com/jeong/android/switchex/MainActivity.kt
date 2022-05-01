package com.jeong.android.switchex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.jeong.android.switchex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val menu_list = ArrayList<Menu>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        menu_list.add(Menu("눈 내리는 채팅방",getString(R.string.menu1),false))
        menu_list.add(Menu("오픈채팅 목록 분리",getString(R.string.menu2),false))
        menu_list.add(Menu("나와의 채팅방 숨김",getString(R.string.menu3),false))
        menu_list.add(Menu("동영상 말풍선 자동재생",getString(R.string.menu4),false))
        menu_list.add(Menu("프로필 이미지로 알림 받기",getString(R.string.menu5),false))
        menu_list.add(Menu("집중모드 알림",getString(R.string.menu6),false))
        menu_list.add(Menu("눈 내리는 채팅방",getString(R.string.menu1),false))
        menu_list.add(Menu("오픈채팅 목록 분리",getString(R.string.menu2),false))
        menu_list.add(Menu("나와의 채팅방 숨김",getString(R.string.menu3),false))
        menu_list.add(Menu("동영상 말풍선 자동재생",getString(R.string.menu4),false))
        menu_list.add(Menu("프로필 이미지로 알림 받기",getString(R.string.menu5),false))
        menu_list.add(Menu("집중모드 알림",getString(R.string.menu6),false))
        menu_list.add(Menu("눈 내리는 채팅방",getString(R.string.menu1),false))
        menu_list.add(Menu("오픈채팅 목록 분리",getString(R.string.menu2),false))
        menu_list.add(Menu("나와의 채팅방 숨김",getString(R.string.menu3),false))
        menu_list.add(Menu("동영상 말풍선 자동재생",getString(R.string.menu4),false))
        menu_list.add(Menu("프로필 이미지로 알림 받기",getString(R.string.menu5),false))
        menu_list.add(Menu("집중모드 알림",getString(R.string.menu6),false))
        menu_list.add(Menu("눈 내리는 채팅방",getString(R.string.menu1),false))
        menu_list.add(Menu("오픈채팅 목록 분리",getString(R.string.menu2),false))
        menu_list.add(Menu("나와의 채팅방 숨김",getString(R.string.menu3),false))
        menu_list.add(Menu("동영상 말풍선 자동재생",getString(R.string.menu4),false))
        menu_list.add(Menu("프로필 이미지로 알림 받기",getString(R.string.menu5),false))
        menu_list.add(Menu("집중모드 알림",getString(R.string.menu6),false))
        menu_list.add(Menu("눈 내리는 채팅방",getString(R.string.menu1),false))
        menu_list.add(Menu("오픈채팅 목록 분리",getString(R.string.menu2),false))
        menu_list.add(Menu("나와의 채팅방 숨김",getString(R.string.menu3),false))
        menu_list.add(Menu("동영상 말풍선 자동재생",getString(R.string.menu4),false))
        menu_list.add(Menu("프로필 이미지로 알림 받기",getString(R.string.menu5),false))
        menu_list.add(Menu("집중모드 알림",getString(R.string.menu6),false))
        menu_list.add(Menu("눈 내리는 채팅방",getString(R.string.menu1),false))
        menu_list.add(Menu("오픈채팅 목록 분리",getString(R.string.menu2),false))
        menu_list.add(Menu("나와의 채팅방 숨김",getString(R.string.menu3),false))
        menu_list.add(Menu("동영상 말풍선 자동재생",getString(R.string.menu4),false))
        menu_list.add(Menu("프로필 이미지로 알림 받기",getString(R.string.menu5),false))
        menu_list.add(Menu("집중모드 알림",getString(R.string.menu6),false))
        menu_list.add(Menu("눈 내리는 채팅방",getString(R.string.menu1),false))
        menu_list.add(Menu("오픈채팅 목록 분리",getString(R.string.menu2),false))
        menu_list.add(Menu("나와의 채팅방 숨김",getString(R.string.menu3),false))
        menu_list.add(Menu("동영상 말풍선 자동재생",getString(R.string.menu4),false))
        menu_list.add(Menu("프로필 이미지로 알림 받기",getString(R.string.menu5),false))
        menu_list.add(Menu("집중모드 알림",getString(R.string.menu6),false))
        menu_list.add(Menu("눈 내리는 채팅방",getString(R.string.menu1),false))
        menu_list.add(Menu("오픈채팅 목록 분리",getString(R.string.menu2),false))
        menu_list.add(Menu("나와의 채팅방 숨김",getString(R.string.menu3),false))
        menu_list.add(Menu("동영상 말풍선 자동재생",getString(R.string.menu4),false))
        menu_list.add(Menu("프로필 이미지로 알림 받기",getString(R.string.menu5),false))
        menu_list.add(Menu("집중모드 알림",getString(R.string.menu6),false))
        menu_list.add(Menu("눈 내리는 채팅방",getString(R.string.menu1),false))
        menu_list.add(Menu("오픈채팅 목록 분리",getString(R.string.menu2),false))
        menu_list.add(Menu("나와의 채팅방 숨김",getString(R.string.menu3),false))
        menu_list.add(Menu("동영상 말풍선 자동재생",getString(R.string.menu4),false))
        menu_list.add(Menu("프로필 이미지로 알림 받기",getString(R.string.menu5),false))
        menu_list.add(Menu("집중모드 알림",getString(R.string.menu6),false))
        menu_list.add(Menu("눈 내리는 채팅방",getString(R.string.menu1),false))
        menu_list.add(Menu("오픈채팅 목록 분리",getString(R.string.menu2),false))
        menu_list.add(Menu("나와의 채팅방 숨김",getString(R.string.menu3),false))
        menu_list.add(Menu("동영상 말풍선 자동재생",getString(R.string.menu4),false))
        menu_list.add(Menu("프로필 이미지로 알림 받기",getString(R.string.menu5),false))
        menu_list.add(Menu("집중모드 알림",getString(R.string.menu6),false))
        menu_list.add(Menu("눈 내리는 채팅방",getString(R.string.menu1),false))
        menu_list.add(Menu("오픈채팅 목록 분리",getString(R.string.menu2),false))
        menu_list.add(Menu("나와의 채팅방 숨김",getString(R.string.menu3),false))
        menu_list.add(Menu("동영상 말풍선 자동재생",getString(R.string.menu4),false))
        menu_list.add(Menu("프로필 이미지로 알림 받기",getString(R.string.menu5),false))
        menu_list.add(Menu("집중모드 알림",getString(R.string.menu6),false))
        menu_list.add(Menu("눈 내리는 채팅방",getString(R.string.menu1),false))
        menu_list.add(Menu("오픈채팅 목록 분리",getString(R.string.menu2),false))
        menu_list.add(Menu("나와의 채팅방 숨김",getString(R.string.menu3),false))
        menu_list.add(Menu("동영상 말풍선 자동재생",getString(R.string.menu4),false))
        menu_list.add(Menu("프로필 이미지로 알림 받기",getString(R.string.menu5),false))
        menu_list.add(Menu("집중모드 알림",getString(R.string.menu6),false))


        val adapter = MenuAdapter(menu_list)
        val decoration = DividerItemDecoration(this,LinearLayoutManager.VERTICAL)

        binding.labRev.addItemDecoration(decoration)
        binding.labRev.adapter = adapter
    }
}