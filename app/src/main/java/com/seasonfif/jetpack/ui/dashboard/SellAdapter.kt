package com.seasonfif.jetpack.ui.dashboard

import android.support.annotation.LayoutRes
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.seasonfif.jetpack.R
import com.seasonfif.jetpack.bean.SellData

class SellAdapter: BaseQuickAdapter<SellData, BaseViewHolder> {

    constructor(@LayoutRes layoutRes : Int): super(layoutRes)

    constructor(@LayoutRes layoutRes : Int, data: List<SellData>): super(layoutRes, data)

    override fun convert(helper: BaseViewHolder, item: SellData?) {
        item?.apply {
            helper.setText(R.id.shop_nick, nick)
            helper.setText(R.id.item_name, title)
            helper.setText(R.id.item_desc, item_description)
            Glide.with(mContext).load("https:$pict_url").into(helper.getView(R.id.img))
        }
    }
}