package com.jeong.android.switchex

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jeong.android.switchex.databinding.ItemBinding

class MenuAdapter(private val menu_list: ArrayList<Menu>): RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    private lateinit var binding: ItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MenuViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bind(menu_list[position])
    }

    override fun getItemCount(): Int {
        return menu_list.size
    }

    class MenuViewHolder(private val binding: ItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(menu: Menu) {
            binding.menuName.text = menu.name
            binding.menuDetail.text = menu.detail
            binding.menuSwitch.isChecked = menu.state
        }
    }
}