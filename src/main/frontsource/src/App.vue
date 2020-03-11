
<template>
  <el-carousel :interval="5000" arrow="always">
    <el-carousel-item v-for="item in 4" :key="item">
      <img src="../images/t2.png">
    </el-carousel-item>
  </el-carousel>
</template>

<style>
  .el-carousel {
    width: 1320px;
    height: 820px;
    margin: 0 auto;
  }
  .el-carousel__item {
    height: 820px;
  }

  .el-carousel__item button {
    margin-top: 500px;
  }

  .el-carousel__item:nth-child(n) {
    
  }
</style>
