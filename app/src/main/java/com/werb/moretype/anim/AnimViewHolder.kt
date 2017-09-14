package com.werb.moretype.anim

import android.view.View
import com.werb.library.MoreViewHolder
import kotlinx.android.synthetic.main.item_view_anim.*

/**
 * Created by wanbo on 2017/7/15.
 */
class AnimViewHolder(containerView: View) : MoreViewHolder<AnimType>(containerView) {

    override fun bindData(data: AnimType) {
        title.text = data.title
        type.text = data.type
        icon.setImageURI(data.typeIcon)
        thumb.setImageURI(data.thumb)
    }
}