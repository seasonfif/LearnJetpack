package com.seasonfif.jetpack.ui.dashboard

import android.support.annotation.LayoutRes
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.seasonfif.jetpack.R
import com.seasonfif.jetpack.bean.ProjectItem

class HotProjectAdapter: BaseQuickAdapter<ProjectItem, BaseViewHolder> {

    constructor(@LayoutRes layoutRes : Int): super(layoutRes)

    constructor(@LayoutRes layoutRes : Int, data: List<ProjectItem>): super(layoutRes, data)

    override fun convert(helper: BaseViewHolder, item: ProjectItem?) {
        item?.apply {
            helper.setText(R.id.title, title)
            helper.setText(R.id.desc, desc)
            var options = RequestOptions().centerCrop()
            Glide.with(mContext).load(envelopePic).apply(options).into(helper.getView(R.id.img))
        }
    }
}