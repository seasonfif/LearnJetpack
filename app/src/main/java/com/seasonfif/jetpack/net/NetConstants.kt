package com.seasonfif.jetpack.net

class NetConstants {

    companion object{
        const val BASE_URL = "https://api.sunofbeach.net/shop/"

        const val LOCAL = """
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
                },
                {
                    "category_id": 50002833,
                    "category_name": null,
                    "click_url": "//s.click.taobao.com/t?e=m%3D2%26s%3DwVUDw5TpKvRw4vFB6t2Z2ueEDrYVVa64Dne87AjQPk9yINtkUhsv0MuAlYAcPDbj6gUq%2Fu52mltm5nS0VR3oT0KAZCke%2BMGJxC%2FP4%2FZfPFbcQmwDRwHnn1oN8CPq4PKMZiqtwk9j5QPwdDmZ4my9rMvJvTzVk%2FO%2B08TC8rEy2O%2FX1X3OfAAgTwsAUEWDbJIhSdChf3U3iXY%2B5QowgvHJPA%3D%3D&scm=1007.15348.115058.0_3756&pvid=400f0d5b-fb52-49b8-9c95-513e76d1139c&app_pvid=59590_33.5.221.225_665_1611375616463&ptl=floorId:3756;originalFloorId:3756;pvid:400f0d5b-fb52-49b8-9c95-513e76d1139c;app_pvid:59590_33.5.221.225_665_1611375616463&union_lens=lensId%3AMAPI%401611375616%40400f0d5b-fb52-49b8-9c95-513e76d1139c_610457217096%401",
                    "commission_rate": "26.06",
                    "coupon_amount": 15,
                    "coupon_click_url": "//uland.taobao.com/coupon/edetail?e=%2B%2BjtvpypPjANfLV8niU3R5TgU2jJNKOfNNtsjZw%2F%2FoJacGu8VhvzmjGVxYlDIf0tfM%2FwNQ%2Fu0qIJNOhE9JKjp8uRTiT9oEhVZV8pr6FWc0MudgpxzgZzTg6t%2FNaxsKJomMHpNfYdHdBwWfUaU7r%2BdMHdg8oYVc%2FsB3IEI%2FtGZdTSBjM3vXy9T041UyeSsrqpDNJ7jXMyFwklM1ZJHcLCJg%3D%3D&&app_pvid=59590_33.5.221.225_665_1611375616463&ptl=floorId:3756;app_pvid:59590_33.5.221.225_665_1611375616463;tpp_pvid:400f0d5b-fb52-49b8-9c95-513e76d1139c&union_lens=lensId%3AMAPI%401611375616%40400f0d5b-fb52-49b8-9c95-513e76d1139c_610457217096%401",
                    "coupon_end_time": "1611590399000",
                    "coupon_info": null,
                    "coupon_remain_count": 20000,
                    "coupon_share_url": "//uland.taobao.com/coupon/edetail?e=%2B%2BjtvpypPjANfLV8niU3R5TgU2jJNKOfNNtsjZw%2F%2FoJacGu8VhvzmjGVxYlDIf0tfM%2FwNQ%2Fu0qIJNOhE9JKjp8uRTiT9oEhVZV8pr6FWc0MudgpxzgZzTg6t%2FNaxsKJomMHpNfYdHdBwWfUaU7r%2BdMHdg8oYVc%2FsB3IEI%2FtGZdTSBjM3vXy9T041UyeSsrqpDNJ7jXMyFwklM1ZJHcLCJg%3D%3D&&app_pvid=59590_33.5.221.225_665_1611375616463&ptl=floorId:3756;app_pvid:59590_33.5.221.225_665_1611375616463;tpp_pvid:400f0d5b-fb52-49b8-9c95-513e76d1139c&union_lens=lensId%3AMAPI%401611375616%40400f0d5b-fb52-49b8-9c95-513e76d1139c_610457217096%401",
                    "coupon_start_fee": "60.0",
                    "coupon_start_time": "1611331200000",
                    "coupon_total_count": 20000,
                    "item_description": "",
                    "item_id": 610457217096,
                    "level_one_category_id": 33,
                    "level_one_category_name": "书籍/杂志/报纸",
                    "nick": "三味图书专营店",
                    "pict_url": "//img.alicdn.com/bao/uploaded/i1/2263306098/O1CN01NqGvi21uuvrUeKmax_!!2263306098-0-picasso.jpg",
                    "seller_id": 2263306098,
                    "shop_title": null,
                    "small_images": {
                        "string": [
                            "//img.alicdn.com/i1/2263306098/O1CN01RekoAg1uuvmsSnGrx_!!2263306098.jpg",
                            "//img.alicdn.com/i4/2263306098/O1CN01o6pXJt1uuvrZ9vCnH_!!2263306098.jpg",
                            "//img.alicdn.com/i2/2263306098/O1CN01q8fBYi1uuvrc3zbN4_!!2263306098.jpg",
                            "//img.alicdn.com/i2/2263306098/O1CN0172mW4B1uuvrhUoBWa_!!2263306098.jpg"
                        ]
                    },
                    "title": "现货部编版53天天练二年级下册语文数学全套人教版RJ小学二年级下册语文数学下册书同步试卷5.3天天练二年级下册同步训练试卷全套",
                    "user_type": 1,
                    "volume": 14851,
                    "zk_final_price": "60.4"
                },
                {
                    "category_id": 50012921,
                    "category_name": null,
                    "click_url": "//s.click.taobao.com/t?e=m%3D2%26s%3DvUENW2NIsjBw4vFB6t2Z2ueEDrYVVa64Dne87AjQPk9yINtkUhsv0MuAlYAcPDbj6gUq%2Fu52mltm5nS0VR3oT0KAZCke%2BMGJxC%2FP4%2FZfPFbcQmwDRwHnn1oN8CPq4PKMZiqtwk9j5QPwdDmZ4my9rP%2FZyAUbYyM6XKeRXv6Rrt29jLN1A0uTJ%2BMztjIg3B4dUg2AIQtRSMrGJe8N%2FwNpGw%3D%3D&scm=1007.15348.115058.0_3756&pvid=400f0d5b-fb52-49b8-9c95-513e76d1139c&app_pvid=59590_33.5.221.225_665_1611375616463&ptl=floorId:3756;originalFloorId:3756;pvid:400f0d5b-fb52-49b8-9c95-513e76d1139c;app_pvid:59590_33.5.221.225_665_1611375616463&union_lens=lensId%3AMAPI%401611375616%40400f0d5b-fb52-49b8-9c95-513e76d1139c_635373186794%401",
                    "commission_rate": "1.35",
                    "coupon_amount": 10,
                    "coupon_click_url": "//uland.taobao.com/coupon/edetail?e=dzjI12z1%2BNgNfLV8niU3R5TgU2jJNKOfNNtsjZw%2F%2FoJ9CxZaJuwF4Q%2FBIjlQuqNz6LtCMd2xMqacJ7tD75HQ3WuFqp8TFaHMNg4Gqf8CT4B88qeY68GqS6aNDWu0MXvFmMHpNfYdHdBwWfUaU7r%2BdMHdg8oYVc%2FsB3IEI%2FtGZdTSBjM3vXy9T041UyeSsrqpDNJ7jXMyFwklM1ZJHcLCJg%3D%3D&&app_pvid=59590_33.5.221.225_665_1611375616463&ptl=floorId:3756;app_pvid:59590_33.5.221.225_665_1611375616463;tpp_pvid:400f0d5b-fb52-49b8-9c95-513e76d1139c&union_lens=lensId%3AMAPI%401611375616%40400f0d5b-fb52-49b8-9c95-513e76d1139c_635373186794%401",
                    "coupon_end_time": "1611590399000",
                    "coupon_info": null,
                    "coupon_remain_count": 49111,
                    "coupon_share_url": "//uland.taobao.com/coupon/edetail?e=dzjI12z1%2BNgNfLV8niU3R5TgU2jJNKOfNNtsjZw%2F%2FoJ9CxZaJuwF4Q%2FBIjlQuqNz6LtCMd2xMqacJ7tD75HQ3WuFqp8TFaHMNg4Gqf8CT4B88qeY68GqS6aNDWu0MXvFmMHpNfYdHdBwWfUaU7r%2BdMHdg8oYVc%2FsB3IEI%2FtGZdTSBjM3vXy9T041UyeSsrqpDNJ7jXMyFwklM1ZJHcLCJg%3D%3D&&app_pvid=59590_33.5.221.225_665_1611375616463&ptl=floorId:3756;app_pvid:59590_33.5.221.225_665_1611375616463;tpp_pvid:400f0d5b-fb52-49b8-9c95-513e76d1139c&union_lens=lensId%3AMAPI%401611375616%40400f0d5b-fb52-49b8-9c95-513e76d1139c_635373186794%401",
                    "coupon_start_fee": "79.0",
                    "coupon_start_time": "1611072000000",
                    "coupon_total_count": 50000,
                    "item_description": "双层密封  10KG超大容量  食品级加厚PP材质",
                    "item_id": 635373186794,
                    "level_one_category_id": 50016349,
                    "level_one_category_name": "厨房/烹饪用具",
                    "nick": "美的炊具旗舰店",
                    "pict_url": "//img.alicdn.com/bao/uploaded/i1/2385614665/O1CN01f4I56S1kKcIrS8vuS_!!0-item_pic.jpg",
                    "seller_id": 2385614665,
                    "shop_title": null,
                    "small_images": {
                        "string": [
                            "//img.alicdn.com/i3/2385614665/O1CN01YS2jlf1kKcIaPiuXq_!!2385614665.jpg",
                            "//img.alicdn.com/i4/2385614665/O1CN01LLAUuz1kKcIRBYZdu_!!2385614665.jpg",
                            "//img.alicdn.com/i1/2385614665/O1CN01ShM1eV1kKcIKvyKDP_!!2385614665.jpg",
                            "//img.alicdn.com/i3/2385614665/O1CN01LVbr9a1kKcIKvxmw7_!!2385614665.jpg"
                        ]
                    },
                    "title": "美的家用米桶20斤装密封防虫防潮储米箱面粉存储罐加厚大米收纳盒",
                    "user_type": 1,
                    "volume": 1568,
                    "zk_final_price": "79"
                },
                {
                    "category_id": 50018925,
                    "category_name": null,
                    "click_url": "//s.click.taobao.com/t?e=m%3D2%26s%3DKcdbDbzcNF5w4vFB6t2Z2ueEDrYVVa64Dne87AjQPk9yINtkUhsv0MuAlYAcPDbj6gUq%2Fu52mltm5nS0VR3oT0KAZCke%2BMGJxC%2FP4%2FZfPFbcQmwDRwHnn1oN8CPq4PKMZiqtwk9j5QPwdDmZ4my9rEbriNwGX4KtaaFTusj39h%2FmLT2OIiexkOMztjIg3B4dUg2AIQtRSMrGJe8N%2FwNpGw%3D%3D&scm=1007.15348.115058.0_3756&pvid=400f0d5b-fb52-49b8-9c95-513e76d1139c&app_pvid=59590_33.5.221.225_665_1611375616463&ptl=floorId:3756;originalFloorId:3756;pvid:400f0d5b-fb52-49b8-9c95-513e76d1139c;app_pvid:59590_33.5.221.225_665_1611375616463&union_lens=lensId%3AMAPI%401611375616%40400f0d5b-fb52-49b8-9c95-513e76d1139c_630286546716%401",
                    "commission_rate": "0.9",
                    "coupon_amount": 10,
                    "coupon_click_url": "//uland.taobao.com/coupon/edetail?e=0KNi4YW9uPcNfLV8niU3R5TgU2jJNKOfNNtsjZw%2F%2FoK39xRXPbj4Mluz2b7GCBZCSP4EVsSQk94ok9UrqiYPD2uFqp8TFaHMNg4Gqf8CT4BwGS5ZuwwbMGfjnImmdqyKmMHpNfYdHdBwWfUaU7r%2BdMHdg8oYVc%2FsB3IEI%2FtGZdTSBjM3vXy9T041UyeSsrqpDNJ7jXMyFwklM1ZJHcLCJg%3D%3D&&app_pvid=59590_33.5.221.225_665_1611375616463&ptl=floorId:3756;app_pvid:59590_33.5.221.225_665_1611375616463;tpp_pvid:400f0d5b-fb52-49b8-9c95-513e76d1139c&union_lens=lensId%3AMAPI%401611375616%40400f0d5b-fb52-49b8-9c95-513e76d1139c_630286546716%401",
                    "coupon_end_time": "1611590399000",
                    "coupon_info": null,
                    "coupon_remain_count": 98615,
                    "coupon_share_url": "//uland.taobao.com/coupon/edetail?e=0KNi4YW9uPcNfLV8niU3R5TgU2jJNKOfNNtsjZw%2F%2FoK39xRXPbj4Mluz2b7GCBZCSP4EVsSQk94ok9UrqiYPD2uFqp8TFaHMNg4Gqf8CT4BwGS5ZuwwbMGfjnImmdqyKmMHpNfYdHdBwWfUaU7r%2BdMHdg8oYVc%2FsB3IEI%2FtGZdTSBjM3vXy9T041UyeSsrqpDNJ7jXMyFwklM1ZJHcLCJg%3D%3D&&app_pvid=59590_33.5.221.225_665_1611375616463&ptl=floorId:3756;app_pvid:59590_33.5.221.225_665_1611375616463;tpp_pvid:400f0d5b-fb52-49b8-9c95-513e76d1139c&union_lens=lensId%3AMAPI%401611375616%40400f0d5b-fb52-49b8-9c95-513e76d1139c_630286546716%401",
                    "coupon_start_fee": "48.0",
                    "coupon_start_time": "1610985600000",
                    "coupon_total_count": 100000,
                    "item_description": "",
                    "item_id": 630286546716,
                    "level_one_category_id": 50008090,
                    "level_one_category_name": "3C数码配件",
                    "nick": "夏语数码旗舰店",
                    "pict_url": "//img.alicdn.com/bao/uploaded/i1/2453676302/O1CN01OMTL7a1wQMddr0uuE_!!0-item_pic.jpg",
                    "seller_id": 2453676302,
                    "shop_title": null,
                    "small_images": {
                        "string": [
                            "//img.alicdn.com/i4/2453676302/O1CN018O4mgt1wQMdUxRggD_!!2453676302.jpg",
                            "//img.alicdn.com/i1/2453676302/O1CN01GGt3zc1wQMdYI9WJ9_!!2453676302.jpg",
                            "//img.alicdn.com/i1/2453676302/O1CN013qZL9a1wQMdcMXd7K_!!2453676302.jpg",
                            "//img.alicdn.com/i1/2453676302/O1CN01IWzZN91wQMdbBLwdz_!!2453676302.jpg"
                        ]
                    },
                    "title": "暖手宝充电宝usb迷你小随身便携式学生两用二合一冬天保暖自发热冬季暖手神器暖手蛋袋暖宝宝可爱小型手握捂",
                    "user_type": 1,
                    "volume": 24719,
                    "zk_final_price": "55"
                }
            ]
        }
    }
}
        """
    }
}