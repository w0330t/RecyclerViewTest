package net.blueness.recyclerviewtest

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import net.blueness.listviewtest.Fruit
import org.jetbrains.anko.find

/**
 * Created by Blueness on 2017/8/26.
 */

class FruitAdapter(private val mFruitList: MutableList<Fruit>):
        RecyclerView.Adapter<FruitAdapter.ViewHolder>() {

    class ViewHolder(val view: View): RecyclerView.ViewHolder(view) {
        val fruitImage: ImageView = view.find(R.id.fruit_image)
        val fruitName: TextView = view.find(R.id.fruit_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder{
        val view = LayoutInflater.from(parent!!.context).inflate(R.layout.fruit_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fruit = mFruitList.get(position)
        holder.fruitImage.setImageResource(fruit.imageId)
        holder.fruitName.setText(fruit.name)
    }

    override fun getItemCount(): Int {
        return mFruitList.size
    }
}