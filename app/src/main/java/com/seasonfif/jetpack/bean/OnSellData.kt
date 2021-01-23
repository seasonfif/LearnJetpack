package com.seasonfif.jetpack.bean

val m = """
{
  "tbk_dg_optimus_material_response": {
    "is_default": "false",
    "request_id": "107bgtanjg9ea",
    "result_list": {
      "map_data": [
        {
          "category_id": 50025796,
          "category_name": null,
          "click_url": "//s.click.taobao.com/t?e=m%3D2%26s%3D%2BWwSdMfSWKNw4vFB6t2Z2ueEDrYVVa64juWlisr3dOdyINtkUhsv0MuAlYAcPDbj6gUq%2Fu52mltm5nS0VR3oT0KAZCke%2BMGJxC%2FP4%2FZfPFbcQmwDRwHnn1oN8CPq4PKMZiqtwk9j5QNwvQ4T0RclA5j%2FUbPdiwLYsShUjNLx%2BdvXfKQ7x6oYh9TbN2T7TmAaSdChf3U3iXY%2B5QowgvHJPA%3D%3D&scm=1007.15348.115058.0_3756&pvid=400f0d5b-fb52-49b8-9c95-513e76d1139c&app_pvid=59590_33.5.221.225_665_1611375616463&ptl=floorId:3756;originalFloorId:3756;pvid:400f0d5b-fb52-49b8-9c95-513e76d1139c;app_pvid:59590_33.5.221.225_665_1611375616463&union_lens=lensId%3AMAPI%401611375616%40400f0d5b-fb52-49b8-9c95-513e76d1139c_630353045571%401",
          "commission_rate": "19.5",
          "coupon_amount": 10,
          "coupon_click_url": "//uland.taobao.com/coupon/edetail?e=c2zzEmvaMKsNfLV8niU3R5TgU2jJNKOfNNtsjZw%2F%2FoJmnqVTWH1RskwNz9wsSioOrWNUu3vb5HXNuDR7L4wMs8uRTiT9oEhVZV8pr6FWc0Pck9zBGc3kt13ydLEUZ7vMmMHpNfYdHdBwWfUaU7r%2BdMHdg8oYVc%2FsB3IEI%2FtGZdTSBjM3vXy9T041UyeSsrqpPGQZmpVpuw4lM1ZJHcLCJg%3D%3D&&app_pvid=59590_33.5.221.225_665_1611375616463&ptl=floorId:3756;app_pvid:59590_33.5.221.225_665_1611375616463;tpp_pvid:400f0d5b-fb52-49b8-9c95-513e76d1139c&union_lens=lensId%3AMAPI%401611375616%40400f0d5b-fb52-49b8-9c95-513e76d1139c_630353045571%401",
          "coupon_end_time": "1611417599000",
          "coupon_info": null,
          "coupon_remain_count": 99319,
          "coupon_share_url": "//uland.taobao.com/coupon/edetail?e=c2zzEmvaMKsNfLV8niU3R5TgU2jJNKOfNNtsjZw%2F%2FoJmnqVTWH1RskwNz9wsSioOrWNUu3vb5HXNuDR7L4wMs8uRTiT9oEhVZV8pr6FWc0Pck9zBGc3kt13ydLEUZ7vMmMHpNfYdHdBwWfUaU7r%2BdMHdg8oYVc%2FsB3IEI%2FtGZdTSBjM3vXy9T041UyeSsrqpPGQZmpVpuw4lM1ZJHcLCJg%3D%3D&&app_pvid=59590_33.5.221.225_665_1611375616463&ptl=floorId:3756;app_pvid:59590_33.5.221.225_665_1611375616463;tpp_pvid:400f0d5b-fb52-49b8-9c95-513e76d1139c&union_lens=lensId%3AMAPI%401611375616%40400f0d5b-fb52-49b8-9c95-513e76d1139c_630353045571%401",
          "coupon_start_fee": "15.0",
          "coupon_start_time": "1611158400000",
          "coupon_total_count": 100000,
          "item_description": "",
          "item_id": 630353045571,
          "level_one_category_id": 50016348,
          "level_one_category_name": "家庭/个人清洁工具",
          "nick": "巧亚逊7777",
          "pict_url": "//img.alicdn.com/bao/uploaded/i1/4023987246/O1CN01wAJIHE23OiWpx09n4_!!4023987246.jpg",
          "seller_id": 4023987246,
          "shop_title": null,
          "small_images": {
            "string": [
              "//img.alicdn.com/i1/4023987246/O1CN01VBh6Wv23OiX2J5ZXB_!!4023987246.jpg",
              "//img.alicdn.com/i4/4023987246/O1CN01Krke3N23OiWuetRLl_!!4023987246.jpg",
              "//img.alicdn.com/i4/4023987246/O1CN01dlMqjn23OiX4DMCXx_!!4023987246.jpg",
              "//img.alicdn.com/i1/4023987246/O1CN010rUrdy23OiWuesMp9_!!4023987246.jpg"
            ]
          },
          "title": "新款升级不锈钢扫把簸箕套装家用柔韧细密单扫帚加大加厚簸箕结实",
          "user_type": 0,
          "volume": 1035,
          "zk_final_price": "34.9"
        }
      ]
    }
  }
}
"""


data class OnSellData(
    var tbk_dg_optimus_material_response: TbkDgOptimusMaterialResponse
)

data class TbkDgOptimusMaterialResponse(
    var is_default: String,
    var request_id: String,
    var result_list: ResultList
)

data class ResultList(
    var map_data: List<SellData>
)

data class SellData(
    var category_id: Int,
    var category_name: Any,
    var click_url: String,
    var commission_rate: String,
    var coupon_amount: Int,
    var coupon_click_url: String,
    var coupon_end_time: String,
    var coupon_info: Any,
    var coupon_remain_count: Int,
    var coupon_share_url: String,
    var coupon_start_fee: String,
    var coupon_start_time: String,
    var coupon_total_count: Int,
    var item_description: String,
    var item_id: Long,
    var level_one_category_id: Int,
    var level_one_category_name: String,
    var nick: String,
    var pict_url: String,
    var seller_id: Long,
    var shop_title: Any,
    var small_images: SmallImages,
    var title: String,
    var user_type: Int,
    var volume: Int,
    var zk_final_price: String
)

data class SmallImages(
    var string: List<String>
)