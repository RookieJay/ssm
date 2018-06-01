<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>The Auto-Tuning Website Template | Details :: </title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!--image slider-->
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script src="js/jquery-slider.js" type="text/javascript"></script>
<script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
<link href="css/easy-responsive-tabs.css" rel="stylesheet" type="text/css" media="all"/>
<link rel="stylesheet" href="css/global.css">
<script src="js/slides.min.jquery.js"></script>
<script>
		$(function(){
			$('#products').slides({
				preload: true,
				preloadImage: 'img/loading.gif',
				effect: 'slide, fade',
				crossfade: true,
				slideSpeed: 350,
				fadeSpeed: 500,
				generateNextPrev: true,
				generatePagination: false
			});
		});
	</script>
<jsp:include page="header.jsp"></jsp:include>
</head>
<body>
<div class="wrap">
  <div class="header">
    <div class="logo">
      <h1><a href="index.html"><img src="images/logo.png" alt=""></a></h1>
    </div>
    <div class="h_right">
      <div class="drp-dwn">
        <ul>
          <li>
            <h3>Select ur Language :</h3>
          </li>
          <li>
            <select onChange="window.location=this.options[this.selectedIndex].value">
              <option value="">English</option>
              <option value="">German</option>
              <option value="">French</option>
            </select>
          </li>
          <li>
            <h3 style="margin-left: 10px;">Currency :</h3>
          </li>
          <li>
            <select onChange="window.location=this.options[this.selectedIndex].value">
              <option value="">US Dollar-USD</option>
              <option value="">Euro-EUR</option>
              <option value="">Indian Rupee-INR</option>
            </select>
          </li>
        </ul>
      </div>
      <div class="header_top_right">
        <div class="login"> <span><a href="${basepath}/car/userInfo"><span class="person_info">个人信息</span> </a></span>   </div>
        <div class="shopping_cart">
           <div class="cart_img"> <img src="${sessionScope.user.avatar}"></div>
          <div class="cart"> <a href="#" title="欢迎登录" rel="nofollow"> <span class="cart_title">欢迎登录，${sessionScope.user.userName}!</span> <a href="${basePath}/logout">注销</a> </a> </div>
        </div>
        <div class="clear"></div>
      </div>
    </div>
    <div class="clear"></div>
    <div class="h_main">
      <ul class="nav">
        <li class="active"><a href="${basepath}/car/home">首页</a></li>
        <li><a href="${basepath}/car/toMaintain">保养</a></li>
        <li><a href="${basepath}/car/toRepair">维修</a></li>
        <li><a href="${basepath}/car/contact">联系</a></li>
      </ul>
      <div class="search">
        <form>
          <input type="text" value="">
          <input type="submit" value="">
        </form>
      </div>
      <div class="clear"></div>
    </div>
  </div>
  <div class="main">
    <div class="main1">
      <div class="details">
        <div class="product-details">
          <div class="images_3_of_2">
            <div id="container">
              <div id="products_example">
                <div id="products">
                  <div class="slides_container"> 
	                  <a href="#" target="_blank"><img src="${basic.appearance}" alt=" " /></a> 
	                  <a href="#" target="_blank"><img src="${basic.trim}" alt=" " /></a> 
	                  <a href="#" target="_blank"><img src="${basic.trim}" alt=" " /></a> 
	                  <a href="#" target="_blank"><img src="${basic.appearance}" alt=" " /></a>
	                  <a href="#" target="_blank"><img src="${basic.appearance}" alt=" " /></a>
	                  <a href="#" target="_blank"><img src="${basic.trim}" alt=" " /></a> 
	                  <a href="#" target="_blank"><img src="${basic.appearance}" alt=" " /></a>
	                  <a href="#" target="_blank"><img src="${basic.trim}" alt=" " /></a> 
	                   </div>
                  <ul class="pagination">
                    <li><a href="#"><img src="${basic.appearance}" alt=" " /></a></li>
                    <li><a href="#"><img src="${basic.trim}" alt=" " /></a></li>
                    <li><a href="#"><img src="${basic.trim}" alt=" " /></a></li>
                    <li><a href="#"><img src="${basic.appearance}" alt=" " /></a></li>
                    <li><a href="#"><img src="${basic.appearance}" alt=" " /></a></li>
                    <li><a href="#"><img src="${basic.trim}" alt=" " /></a></li>
                    <li><a href="#"><img src="${basic.appearance}" alt=" " /></a></li>
                    <li><a href="#"><img src="${basic.trim}" alt=" " /></a></li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
          <div class="desc span_3_of_2">
            <h2 style="font-size: 50px">${basic.name }</h2>
            <p>${basic.launchdate}上市 ${basic.swept}排量</p>
            <div class="price">
              <p>价格: <span>${basic.price}</span></p>
            </div>
            <div class="available">
              <p>车身外观</p>
              <ul>
                <li>颜色:${basic.color }</li>
                <li>尺寸:1720*1520*1320</select>
              </ul>
            </div>
            <div class="share-desc">
              <div class="share">
                <p>Share This Car :</p>
                <ul>
                  <li><a href="#"><img src="images/icon_1.png" alt=""></a></li>
                  <li><a href="#"><img src="images/icon_2.png" alt=""></a></li>
                  <li><a href="#"><img src="images/icon_3.png" alt=""></a></li>
                </ul>
              </div>
              <div class="button1"><span></span></div>
              <div class="clear"></div>
            </div>
          </div>
          <div class="clear"></div>
        </div>
        <div class="product_desc">
          <div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
            <ul class="resp-tabs-list">
              <li class="resp-tab-item resp-tab-active" aria-controls="tab_item-0" role="tab">Details</li>
              <li class="resp-tab-item" aria-controls="tab_item-2" role="tab">Add Reviews</li>
              <li class="resp-tab-item" aria-controls="tab_item-2" role="tab">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
              <li class="resp-tab-item resp-tab-active" aria-controls="tab_item-0" role="tab">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
              <li class="resp-tab-item" aria-controls="tab_item-2" role="tab">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
              <li class="resp-tab-item resp-tab-active" aria-controls="tab_item-0" role="tab">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
              <li class="resp-tab-item" aria-controls="tab_item-2" role="tab">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
              <li class="resp-tab-item resp-tab-active" aria-controls="tab_item-0" role="tab">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
              <li class="resp-tab-item" aria-controls="tab_item-2" role="tab">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
              <li class="resp-tab-item" aria-controls="tab_item-2" role="tab">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
              <li class="resp-tab-item" aria-controls="tab_item-2" role="tab">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
              <li class="resp-tab-item" aria-controls="tab_item-2" role="tab">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
              <li class="resp-tab-item" aria-controls="tab_item-2" role="tab">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
              <li class="resp-tab-item" aria-controls="tab_item-2" role="tab">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
              <li class="resp-tab-item resp-tab-active" aria-controls="tab_item-0" role="tab">&nbsp;&nbsp;&nbsp;</li>
              <div class="clear"></div>
            </ul>
            <div class="resp-tabs-container">
              <h2 class="resp-accordion resp-tab-active" role="tab" aria-controls="tab_item-0"><span class="resp-arrow"></span>Details</h2>
              <div class="product-desc resp-tab-content resp-tab-content-active" style="display:block" aria-labelledby="tab_item-0">
                <p>车名:${basic.name}和${basic.id}</p>
                <p>品牌：宝马</p>
                <p>车型：${basic.category }</p>
                <p>上市：${basic.launchdate }</p>
                <p>颜色：${basic.color }</p>
                <p>排量：${basic.swept }</p>
                <p>质保：${basic.description }</p>
                <p>价格：${basic.price }</p>
              </div>
              <h2 class="resp-accordion" role="tab" aria-controls="tab_item-2"><span class="resp-arrow"></span>Add Reviews</h2>
              <div class="review resp-tab-content" aria-labelledby="tab_item-2">
                <h4>在此发表您的评论 </h4>
                <form action="${basePath}/addReview">
                <ul>
                  <li>Marks :
	                  <select name="marks">
	                  <option  value="1" >1</option>
	                  <option  value="2" >2</option>
	                  <option  value="3" >3</option>
	                  <option  value="4" >4</option>
	                  <option  value="5" selected="selected">5</option>
	                  </select>
                  </li>
                </ul>
                <div class="your-review">
                  <h3>How Do You Rate This Car?</h3>
                  <p>Write Your Own Review?</p>
                  
                    <div> <span>
                      <label>Car<input class="red" name="id" type="text" value="${basic.id}" readonly="readonly" />*</input></label>
                      <label>Nickname<span class="red">*</span></label>
                      </span> <span>
                      <input type="text" name="nickname" value="">
                      </span> </div>
                    <div> <span>
                      <label>Review<span class="red">*</span></label>
                      </span> <span>
                      <input type="text" name="content" value="">
                      </span> </div>
                    <div> <span>
                      <input type="submit" value="SUBMIT">
                      </span> </div>
                      <hr>
                       <h4>精彩评论 </h4>
                        <c:forEach items="${reviews}" var="r">
	             		<p>来自：${r.nickname}</p>
	                	<p>打分:${r.marks}</p>
	                	<p>评论:${r.content}</p>
	               		<p>时间：${r.date }</p>
	                </c:forEach>
                  </form>
                </div>
              </div>
            </div>
          </div>
        </div>
        <script type="text/javascript">
    $(document).ready(function () {
        $('#horizontalTab').easyResponsiveTabs({
            type: 'default', //Types: default, vertical, accordion           
            width: 'auto', //auto or any width like 600px
            fit: true   // 100% fit in a container
        });
    });
   </script>
        <div class="content_bottom">
          <div class="text-h1 top1 btm">
            <h2>更多精彩展示</h2>
          </div>
          <div class="div2">
            <div id="mcts1"> <img src="images/d_pic2.jpg" alt=""/> <img src="images/d_pic1.jpg" alt="" /> <img src="images/d_pic3.jpg" alt="" /> <img src="images/d_pic4.jpg" alt=""/> <img src="images/d_pic1.jpg" alt="" /> <img src="images/d_pic4.jpg" alt="" /> </div>
          </div>
        </div>
      </div>
      <div class="clear"></div>
    </div>
  </div>
  <div class="footer">
    <div class="f_left">
      <div class="f_nav">
        <ul>
          <li><a href="">about us</a></li>
          <li><a href="">site map</a></li>
          <li><a href="">customer Service</a></li>
          <li><a href="">search terms</a></li>
          <li><a href="">contact us</a></li>
        </ul>
      </div>
      <div class="copy">
        <p class="w3-link">Â© All Rights Reserved | More Templates <a href="http://www.cssmoban.com/" target="_blank" title="æ¨¡æ¿ä¹å®¶">æ¨¡æ¿ä¹å®¶</a> - Collect from <a href="http://www.cssmoban.com/" title="ç½é¡µæ¨¡æ¿" target="_blank">ç½é¡µæ¨¡æ¿</a> </p>
      </div>
    </div>
    <div class="social-icons">
      <ul>
        <li class="icon1"><a href="#" target="_blank"> </a></li>
        <li class="icon2"><a href="#" target="_blank"> </a></li>
        <li class="icon3"><a href="#" target="_blank"> </a></li>
        <li class="icon4"><a href="#" target="_blank"> </a></li>
        <div class="clear"></div>
      </ul>
    </div>
    <div class="clear"></div>
  </div>
</div>
</body>
</html>